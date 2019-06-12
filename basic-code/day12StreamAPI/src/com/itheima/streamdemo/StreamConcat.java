package com.itheima.streamdemo;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args) {

        Stream<String> a = Stream.of("A", "B", "C");
        Stream<String> b = Stream.of("A", "5", "6");
//
//        Stream<String> concat = Stream.concat(a, b);
//
//        concat.forEach(System.out::println);
        Stream<String> concat = Stream.concat(a, b);

        Set<String> collect = concat.collect(Collectors.toSet());

        System.out.println(collect);


    }
}
