package com.test.single;

/**
 * @author chenhonghao
 * @date 2020-03-03 15:47
 */
public class SingleSafe {
    private static class SingleSafeHandle{
        private static SingleSafe singleSafe=new SingleSafe();
    }
    private SingleSafe(){}
    public static SingleSafe getInstance(){
        return SingleSafeHandle.singleSafe;
    }
}


