package com.funnyy.component.encrypt.api.model;

/**
 * Created by sky on 17-6-15.
 */
public class EncryptedModel {
    /**
     * 加密方法
     */
    private String mode;

    /**
     * 已加密结果
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
