package com.test.abstractfactory;

/**
 * 男性黄种人的实现类
 *
 * @author chenhonghao
 * @date 2020-03-04 15:07
 */
public class YellowMaleHuman extends YellowHuman{
    @Override
    public void sex() {
        System.out.println("该黄种人的性别为男...");
    }
}
