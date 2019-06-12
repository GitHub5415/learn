package com.itheima.streamdemo;

import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> list = List.of("张三", "李四", "三五", "石破天", "司徒长青");

        list.stream().filter(s-> s.contains("三")).filter(s->s.length()==3).forEach(System.out::println);

    }
}
