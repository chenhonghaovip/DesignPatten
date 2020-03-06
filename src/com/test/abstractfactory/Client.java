package com.test.abstractfactory;

/**
 * 场景类
 *
 * @author chenhonghao
 * @date 2020-03-05 09:10
 */
public class Client {
    public static void main(String[] args) {
        Human human = new HumanFactory().createHuman(WhiteFemaleHuman.class);
        human.cry();
    }
}
