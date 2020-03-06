package com.test.factory;

/**
 * 圆形工厂
 *
 * @author chenhonghao
 * @date 2020-03-03 16:34
 */
public class CircleFactory implements AbstractFactory{
    @Override
    public AbstractProduct CreatShape() {
        return new Circle();
    }
}
