package com.itheima.streamdemo;

import java.util.stream.Stream;

public class StreamLimitDemo {

    public static void main(String[] args) {

//        Stream.of("1","2","3","4","5","6").limit(3).forEach(System.out::println);

//        Stream.of("1","2","3","4","5","6").skip(3).forEach(System.out::println);


//        Stream.of("1","2","3","4","5","6").map(s->Integer.parseInt(s)).forEach(System.out::println);
        Stream.of("1","2","3","4","5","6").map(Integer::parseInt).forEach(System.out::println);






    }
}
