package com.test.tactics;

/**
 * 具体策略类
 *
 * @author chenhonghao
 * @date 2020-03-11 13:50
 */
public class SecondGun implements Weapon{
    @Override
    public void gun() {
        System.out.println("使用S12K霰弹枪。");
    }
}
