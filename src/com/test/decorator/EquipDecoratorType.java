package com.test.decorator;

/**
 * 装饰-装备镶嵌不同类型宝石
 *
 * @author chenhonghao
 * @date 2020-03-03 14:34
 */
public class EquipDecoratorType extends EquipDecorator{
    EquipDecoratorType(Equip equip) {
        super(equip);
    }
    @Override
    public void description() {
        equip.description();
        System.out.println("镶嵌攻击加5的宝石");
    }
}
