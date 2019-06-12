package cn.itcast.day04.homework;

public class HomeWorkMethod {
    /**
     * 1. 整数求和
     *
     * @param a 参数1
     * @param b 参数2
     * @return 返回结果 参数1+参数2的和
     */
    public static int sum(int a, int b) {
        return a + b;
    }


    public static float sum(float a, float b) {
        return a + b;
    }


    public static float square(float a, float b) {
        return a * b;
    }

    public static float allLength(float a, float b) {
        return 2 * (a + b);
    }

    public static void main(String[] args) {

        System.out.println("int和：" + sum(1, 2));
        System.out.println("float和：" + sum(1.1f, 2.1f));
        System.out.println("面积：" + square(1.1f, 2.1f));
        System.out.println("周长：" + allLength(1.1f, 2.1f));


    }


}
