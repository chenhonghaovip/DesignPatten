package com.test.factory;

/**
 * 正方形产品
 *
 * @author chenhonghao
 * @date 2020-03-03 16:34
 */
public class Rectangle implements AbstractProduct{
    @Override
    public void shape() {
        System.out.println("矩形");
    }
}
