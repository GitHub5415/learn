package com.itheima.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamToArray {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);

//        Object[] objects = list.stream().toArray();
//

        Stream<Integer> stream = list.stream();

        Integer[] integers = stream.toArray(Integer[]::new);
//        Arrays.toString(objects);

//        list.toArray(Integer[]::new);
    }
}
