package com.itheima.lamada.test2;

public class DoFood {

    public static void doFood(Cook cook) {
        cook.makeFood();
    }


    public static void main(String[] args) {
        doFood(() ->System.out.println("炒米饭"));
    }
}
