package com.test.decorator;

/**
 * @author chenhonghao
 * @date 2020-03-03 14:28
 */
abstract class EquipDecorator implements Equip{
    protected Equip equip;

    public EquipDecorator(Equip equip) {
        this.equip = equip;
    }

    @Override
    public void description() {
        equip.description();
    }

    @Override
    public void attack() {
        equip.attack();
    }

    @Override
    public void defense() {
        equip.defense();
    }
}
