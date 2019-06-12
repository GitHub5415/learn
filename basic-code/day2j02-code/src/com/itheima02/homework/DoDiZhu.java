package com.itheima02.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DoDiZhu {
    public static void main(String[] args) {
        //牌集合
        ArrayList<String> pookerBox = new ArrayList<>();
        //花色集合,参数返回值是List
        List<String> pookerColor = Arrays.asList("♥", "♠", "♣", "♦");
        //创建牌数字集合
        List<String> pookerValue = new ArrayList<>();
        for (int i = 2; i < 11; i++) {
            pookerValue.add(i + "");
        }
        pookerValue.add("A");
        pookerValue.add("J");
        pookerValue.add("Q");
        pookerValue.add("K");
        //放入牌盒
        for (String curValue : pookerValue) {
            for (String curColor : pookerColor) {
                pookerBox.add(curColor.concat(curValue));
            }
        }
        pookerBox.add("小王");
        pookerBox.add("大王");
        System.out.println("pookerBox Size:" + pookerBox.size() + ",content:" + pookerBox);
        //洗牌
        Collections.shuffle(pookerBox);
        System.out.println("pookerBox Size:" + pookerBox.size() + ",content:" + pookerBox);
        //发牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> buttonPooker = new ArrayList<>();
        for (int i = 0; i < pookerBox.size(); i++) {
            if (i >= 51) {
                buttonPooker.add(pookerBox.get(i));
            } else {
                switch (i % 3) {
                    case 0:
                        player1.add(pookerBox.get(i));
                        break;
                    case 1:
                        player2.add(pookerBox.get(i));
                        break;
                    case 2:
                        player3.add(pookerBox.get(i));
                        break;
                }
            }

        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        System.out.println("player1:"+player1);
        System.out.println("player2:"+player2);
        System.out.println("player3:"+player3);
        System.out.println("底牌:"+buttonPooker);
    }
}
