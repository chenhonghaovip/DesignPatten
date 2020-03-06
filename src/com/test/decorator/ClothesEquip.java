package com.test.decorator;

/**
 * 服装类装备
 *
 * @author chenhonghao
 * @date 2020-03-03 14:26
 */
public class ClothesEquip implements Equip{
    @Override
    public void description() {
        System.out.println("服装类装备");
    }

    @Override
    public void attack() {

    }

    @Override
    public void defense() {

    }
}
