package com.itheima02.fanxing;

public class GenericClassInstance {

    public static void main(String[] args) {
        GenericClass<String> testInstance=new GenericClass<>();

        testInstance.setTest("aaa");

        System.out.println(testInstance.getTest().getClass());

    }
}
