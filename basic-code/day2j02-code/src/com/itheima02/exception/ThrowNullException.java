package com.itheima02.exception;

import java.util.Objects;

public class ThrowNullException {
    public static void main(String[] args) {
        String ss=null;
        //非空值，否则抛出空指针异常
        Objects.requireNonNull(ss);
    }
}
