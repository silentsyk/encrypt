package com.funnyy.component.encrypt.api.model;

/**
 * Created by sky on 17-6-15.
 */
public class EncryptModel {
    /**
     * 加密方法
     */
    private String mode;

    /**
     * 待加密内容
     */
    private String content;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
