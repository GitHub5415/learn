package cn.itcast.day05.homework;
/*1.定义一个用于存放班级分数的数组
        int[] score = {80,90,85,90,78,88,89,93,98,75};
        2.求出班级不及格人数(分数低于60分的就是不及格)
        3.求出班级的平均分
        4.求出班级的总分数*/
public class HomeWork3 {

    public static void main(String[] args) {
        int[] classScoreRecords={80,90,85,90,78,88,89,93,98,75};
        //不通过的人数
        int unPass=0;
        //成绩总和
        int scoreSum=0;
        //平均分
        float score=0.0F;
        for (int i = 0; i < classScoreRecords.length; i++) {
            scoreSum+=classScoreRecords[i];
            if(classScoreRecords[i]<60){
                ++unPass;
            }
        }
        System.out.println("不通过的人数："+unPass);

        score=(float) scoreSum/classScoreRecords.length;
        System.out.println("平均分："+score);

        System.out.println("总分："+scoreSum);




    }
}
