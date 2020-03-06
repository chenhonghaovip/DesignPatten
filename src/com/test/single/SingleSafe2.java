package com.test.single;

/**
 * 懒汉式单例(线程安全)
 *
 * @author chenhonghao
 * @date 2020-03-03 15:47
 */
public class SingleSafe2 {
    private static SingleSafe2 singleSafe2;
    static {
        singleSafe2 = new SingleSafe2();
    }

    private SingleSafe2(){}
    public static SingleSafe2 getInstance(){
        return singleSafe2;
    }
}


