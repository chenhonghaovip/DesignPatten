package com.test.decorator;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * 客户端使用
 *
 * @author chenhonghao
 * @date 2020-03-03 14:35
 */
public class TestMain {
    public static void main(String[] args) {
        Equip equip = new ClothesEquip();
        equip.description();
        System.out.println("装饰模式开始测试");
        equip = new EquipDecoratorType(equip);
        equip.description();

        System.out.println("装饰模式结束测试");

        long time = 1583222400000L;
        Date date = new Date(time);
        System.out.println(date);
    }
}
