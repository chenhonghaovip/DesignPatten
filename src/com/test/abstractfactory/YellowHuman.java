package com.test.abstractfactory;

/**
 * 抽象苹果
 *
 * @author chenhonghao
 * @date 2020-03-04 13:34
 */
public abstract class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人会笑...");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭...");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话，一般说的都是双字节...");
    }
}
