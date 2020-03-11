package com.test.tactics;

/**
 * 环境类
 *
 * @author chenhonghao
 * @date 2020-03-11 13:50
 */
public class Context {
    private Weapon weapon;
    Context(Weapon weapon) {
        this.weapon = weapon;
    }
    void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    void gun() {
        weapon.gun();
    }
}
