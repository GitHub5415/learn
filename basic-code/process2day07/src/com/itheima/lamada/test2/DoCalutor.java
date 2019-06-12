package com.itheima.lamada.test2;

public class DoCalutor {

    public static void main(String[] args) {
        testCalutor(120, 130, (int x, int y) -> {
            return x + y;
        });
    }

    public static void testCalutor(int x, int y, MyCalutor myCalutor) {
        int sum = myCalutor.cacutor(x, y);
        System.out.println("sum=" + sum);
    }
}
