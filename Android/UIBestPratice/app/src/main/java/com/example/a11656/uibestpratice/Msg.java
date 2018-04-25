package com.example.a11656.uibestpratice;

/**
 * Created by 11656 on 2018/4/25.
 */

public class Msg {
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SEND = 1;

    private String content;
    private int type;

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }
}
