package com.test.tactics;

/**
 * 具体策略类
 *
 * @author chenhonghao
 * @date 2020-03-11 13:49
 */
public class FirstGun implements Weapon{
    @Override
    public void gun() {
        System.out.println("使用AWM狙击步枪。");
    }
}
