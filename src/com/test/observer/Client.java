package com.test.observer;

/**
 * 场景
 *
 * @author chenhonghao
 * @date 2020-03-11 15:53
 */
public class Client {
    public static void main(String[] args) {
        WechatServer wechatServer = new WechatServer("111");
        wechatServer.registerObserver(new FirstUser());
        wechatServer.registerObserver(new SecondUser());
        wechatServer.notifyObserver();
        wechatServer.setMessage("2222");
        wechatServer.notifyObserver();
    }
}
