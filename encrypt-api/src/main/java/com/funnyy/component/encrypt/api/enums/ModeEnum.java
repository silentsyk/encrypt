package com.funnyy.component.encrypt.api.enums;

/**
 * Created by sky on 17-6-15.
 */
public enum  ModeEnum {
    DES("DES","对称算法");

    private String code;
    private String name;

    ModeEnum(String code, String name){
        this.code=code;
        this.name=name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
