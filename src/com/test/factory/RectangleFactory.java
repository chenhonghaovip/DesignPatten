package com.test.factory;

/**
 * 正方形工厂
 *
 * @author chenhonghao
 * @date 2020-03-03 16:35
 */
public class RectangleFactory implements AbstractFactory{
    @Override
    public AbstractProduct CreatShape() {
        return new Rectangle();
    }
}
