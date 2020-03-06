package com.test.decorator;

/**
 * 装备接口
 * 装备equip
 * @author chenhonghao
 * @date 2020-03-03 14:23
 */
public interface Equip {
    /**
     * 描述
     */
    void description();

    /**
     * 攻击
     */
    void attack();

    /**
     * 防御
     */
    void defense();
}
