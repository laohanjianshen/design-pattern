package com.xpc.proxy;

import org.apache.commons.io.FileUtils;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Proxy {
    public static Object newProxyInstance(Class inface, InvocationHandler h) throws Exception {
        String methodStr = "";
        for (Method method : inface.getMethods()) {
            methodStr += "     public void " + method.getName() + "() {\n" +
                    "           try{ \n" +
                    "               Method md = " + inface.getName() + ".class.getMethod(\""
                    + method.getName() + "\");\n" +
                    "               h.invoke(this,md);\n" +
                    "           }catch(Exception e){\n" +
                    "               e.printStackTrace();\n" +
                    "           }\n" +
                    "     }\n";
        }
        String str = "package com.xpc.myproxy;\n" +
                "\n" +
                "import com.xpc.proxy.Moveable;\n" +
                "import com.xpc.proxy.InvocationHandler;\n" +
                "import java.lang.reflect.Method;\n" +
                "public class $Proxy0 implements" + " " + inface.getSimpleName() + "{\n" +
                "\n" +
                "     private InvocationHandler h;\n" +
                "\n" +
                "     public $Proxy0(InvocationHandler h) {\n" +
                "        this.h = h;\n" +
                "    }\n" +
                "\n" + methodStr + "}";
        //产生java文件
        String fileName = System.getProperty("user.dir") + "\\src\\main\\java\\com\\xpc\\myproxy\\$Proxy0.java";
        System.out.println(fileName);
        File file = new File(fileName);
        FileUtils.writeStringToFile(file, str);
        //编译
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        Iterable units = fileManager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, null, null, units);
        task.call();
        fileManager.close();
        //lodad到内存中
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class clzz = classLoader.loadClass("com.xpc.myproxy.$Proxy0");
        Constructor constructor = clzz.getConstructor(InvocationHandler.class);
        return constructor.newInstance(h);
    }
}
