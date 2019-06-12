package com.itheima02.fanxing;

public class GenericInterfaceInstance2<TMP> implements GenericInterface<TMP>{
    @Override
    public void testMethod1(TMP tmp) {

    }

    @Override
    public TMP testMethod2(TMP tmp) {
        return null;
    }
}
