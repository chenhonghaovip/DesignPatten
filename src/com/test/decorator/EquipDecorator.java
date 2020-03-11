package com.test.decorator;

/**
 * @author chenhonghao
 * @date 2020-03-03 14:28
 */
abstract class EquipDecorator implements Equip{
    Equip equip;
    EquipDecorator(Equip equip) {
        this.equip = equip;
    }
    @Override
    public void description() {
        equip.description();
    }
}
