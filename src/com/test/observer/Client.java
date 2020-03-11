package com.test.observer;

/**
 * 场景
 *
 * @author chenhonghao
 * @date 2020-03-11 15:53
 */
public class Client {
    public static void main(String[] args) {
        Observerable observerable = new WechatServer("111");
        observerable.registerObserver(new FirstUser());
        observerable.registerObserver(new SecondUser());
        observerable.notifyObserver();
    }
}
