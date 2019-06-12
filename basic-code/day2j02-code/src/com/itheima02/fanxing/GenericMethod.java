package com.itheima02.fanxing;

public class GenericMethod {

    public <T> void testMethod(T t){
        System.out.println("Class:"+t.getClass());
    }

    public <T> T  eee(T t){
        return t;
    }
}
