package com.test.abstractfactory;

/**
 * 女性黄种人的实现类
 *
 * @author chenhonghao
 * @date 2020-03-04 14:52
 */
public class YellowFemaleHuman extends YellowHuman{
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为女...");
    }
}
