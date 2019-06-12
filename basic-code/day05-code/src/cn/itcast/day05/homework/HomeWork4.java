package cn.itcast.day05.homework;

import java.util.Arrays;

/**
 * 数组反转
 */
public class HomeWork4 {

    public static void main(String[] args) {
        int[] classScoreRecords={80,90,85,90,78,88,89,93,98,75};
        //起始元素位置
        int start=0;
        //终止元素位置
        int end=classScoreRecords.length-1;
        while(start<end){
            int temp=classScoreRecords[start];
            classScoreRecords[start]=classScoreRecords[end];
            classScoreRecords[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(classScoreRecords));

    }
}
