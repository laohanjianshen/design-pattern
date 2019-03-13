package com.xpc.prototype;

import java.io.Serializable;

/**
 * 保时捷车钥匙
 */
public class Key implements Cloneable,Serializable {

    private static final long serialVersionUID = -7849507670618700157L;
    private String keyName;

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    @Override
    public String toString() {
        return "Key{" +
                "keyName='" + keyName + '\'' +
                '}';
    }
}
