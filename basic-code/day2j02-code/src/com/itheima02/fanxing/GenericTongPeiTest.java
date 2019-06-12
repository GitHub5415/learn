package com.itheima02.fanxing;

import java.util.ArrayList;
import java.util.Collection;

public class GenericTongPeiTest {

    public static void main(String[] args) {
        Collection<Object> collection=new ArrayList<>();
        Collection<Integer> collection1=new ArrayList<>();
        Collection<Number> collection2=new ArrayList<>();
        Collection<String> collection3=new ArrayList<>();

//        testTongPeiMethod(collection);
//        testTongPeiMethod(collection1);
//        testTongPeiMethod(collection2);
//        testTongPeiMethod(collection3);

    }

    public static void testTongPeiMethod(Collection<? super Number> collection){

    }
}
