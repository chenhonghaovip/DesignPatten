package com.test.adapter;

/**
 * 目标实现
 *
 * @author chenhonghao
 * @date 2020-03-05 11:18
 */
public class TargetImpl implements Target{
    @Override
    public void getInfo() {
        System.out.println("目标接口");
    }
}
