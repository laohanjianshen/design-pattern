package com.xpc.prototype;

import java.io.*;

/**
 * 保时捷
 */
public class Porsche implements Cloneable,Serializable {

    private static final long serialVersionUID = 8592338035788228899L;
    private String name;
    private Integer price;
    private String color;
    private Key key;

    public Porsche(String name, Integer price, String color, Key key) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.key = key;
    }

    /**
     * 浅拷贝克隆
     * @return
     */
    public Object clone() {
        Porsche porsche = null;
        try {
            porsche = (Porsche) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return porsche;
    }

    /**
     * 深拷贝克隆
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写出到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读进来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Key getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "Porsche{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", key=" + key +
                '}';
    }
}
