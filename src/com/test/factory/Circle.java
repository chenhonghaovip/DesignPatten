package com.test.factory;

/**
 * 圆形产品
 *
 * @author chenhonghao
 * @date 2020-03-03 16:33
 */
public class Circle implements AbstractProduct{
    @Override
    public void shape() {
        System.out.println("圆形");
    }
}
