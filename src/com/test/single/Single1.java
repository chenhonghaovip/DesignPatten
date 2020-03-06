package com.test.single;

import java.awt.image.VolatileImage;

/**
 * 懒汉式单例(线程安全)
 *
 * @author chenhonghao
 * @date 2020-03-05 09:37
 */
public class Single1 {
    private static volatile Single1 single1;

    private Single1() {
    }
    private static Single1 getInstance(){
        if (single1==null){
            synchronized (Single1.class){
                if (single1==null){
                    single1 = new Single1();
                }
            }
        }
        return single1;
    }
}
