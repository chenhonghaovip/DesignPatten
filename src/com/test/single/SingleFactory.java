package com.test.single;

import java.lang.reflect.Constructor;

/**
 * 单例线程工厂
 *
 * @author chenhonghao
 * @date 2020-03-05 09:42
 */
class SingleFactory {
    <T> T getSingle(Class<T> clazz){
        T t = null;
        Constructor constructors;
        try {
            constructors = clazz.getDeclaredConstructor();
            constructors.setAccessible(true);
            t = (T)constructors.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
