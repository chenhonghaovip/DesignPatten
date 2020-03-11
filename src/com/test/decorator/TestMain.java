package com.test.decorator;

/**
 * 客户端使用
 *
 * @author chenhonghao
 * @date 2020-03-03 14:35
 */
public class TestMain {
    public static void main(String[] args) {
        Equip equip = new ClothesEquip();
        equip = new EquipDecoratorType(equip);
        equip.description();
    }
}
