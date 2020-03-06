package com.test.adapter;

/**
 * 适配器
 *
 * @author chenhonghao
 * @date 2020-03-05 11:21
 */
public class AdapteeImpl extends TargetImpl implements Adaptee{
    @Override
    public void getInfos() {
        System.out.println("我的接口操作，准备进行目标接口操作");
        super.getInfo();
    }
}
