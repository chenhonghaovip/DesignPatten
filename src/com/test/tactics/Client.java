package com.test.tactics;

/**
 * 场景类
 *
 * @author chenhonghao
 * @date 2020-03-11 13:52
 */
public class Client {
    public static void main(String[] args) {
        //使用第一种策略进行射击操作
        Context context = new Context(new FirstGun());
        context.gun();
        //使用第二种策略进行设计操作
        context.setWeapon(new SecondGun());
        context.gun();
    }
}
