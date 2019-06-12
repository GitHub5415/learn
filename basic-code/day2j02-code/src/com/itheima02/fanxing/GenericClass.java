package com.itheima02.fanxing;

/**
 * 静态泛型方法不能使用类定义的泛型对象。
 * @param <TMP>
 */
public class GenericClass<TMP>{

    private TMP test;



    public void setTest(TMP test){
        this.test=test;
    }

    public TMP getTest(){
        return this.test;
    }


}
