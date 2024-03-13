package com.naveen.java11;

public class TooSmallNameException extends  RuntimeException{
    private  String msg;

    public TooSmallNameException(String msg) {
        this.msg = msg;
    }

    public TooSmallNameException() {
        this.msg = "Name too small";
    }
}
