package com.test.factory;

/**
 * 测试client
 *
 * @author chenhonghao
 * @date 2020-03-03 16:36
 */
public class TestMain {
    public static void main(String[] args) {
        new CircleFactory().CreatShape().shape();
        new RectangleFactory().CreatShape().shape();
    }
}
