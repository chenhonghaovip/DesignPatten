package com.test.abstractfactory;

/**
 * 女性白种人的实现类
 *
 * @author chenhonghao
 * @date 2020-03-04 15:08
 */
public class WhiteFemaleHuman extends WhiteHuman{
    @Override
    public void sex() {
        System.out.println("该白种人的性别为女...");
    }
}
