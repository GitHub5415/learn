package com.itcast.day08.homework;

public class StringContainsStr {

    public static void main(String[] args) {

        String largeStr="woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";

        String smallStr="heima";

        int count=0;
        int index=-1;
        while(index<largeStr.length()){
            index=largeStr.indexOf(smallStr,index);
            if(index>0){
                count++;
            }else {
                break;
            }
            index=index+smallStr.length();
        }
        System.out.println("次数:"+count);

    }
}
