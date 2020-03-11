package com.test.observer;

/**
 * 观察者2
 *
 * @author chenhonghao
 * @date 2020-03-11 15:52
 */
public class SecondUser implements Observer{
    @Override
    public void update(String message) {
        System.out.println("观察者2发现消息"+message);
    }
}
