package com.itheima.streamdemo;

import java.util.List;

public class SreamPara {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);

        list.parallelStream().forEach(System.out::println);
    }
}
