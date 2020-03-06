package com.test.decorator;

/**
 * 装饰-装备镶嵌不同类型宝石
 *
 * @author chenhonghao
 * @date 2020-03-03 14:34
 */
public class EquipDecoratorType extends EquipDecorator{
    public EquipDecoratorType(Equip equip) {
        super(equip);
    }

    @Override
    public void description() {
        equip.description();
        this.descriptionAttack();
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void defense() {
        super.defense();
    }

    public void descriptionAttack(){
        System.out.println("镶嵌攻击加5的宝石");
    }
}
