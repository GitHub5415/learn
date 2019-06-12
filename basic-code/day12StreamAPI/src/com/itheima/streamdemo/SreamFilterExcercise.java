package com.itheima.streamdemo;

import java.util.stream.Stream;

public class SreamFilterExcercise {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("张三丰", "楚云飞", "李四", "诸葛青云");

        Stream<String> stringStream = stream.filter(m -> m.length() == 3);
//常规操作
//        stringStream.forEach(e-> System.out.println(e.toString()));
        //使用函数引用的方式
//        stringStream.forEach(System.out::println);
        //使用count计数
        System.out.println("count:"+stringStream.count());



    }

}
