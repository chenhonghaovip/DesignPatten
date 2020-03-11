package com.test.duty;

/**
 * 场景
 *
 * @author chenhonghao
 * @date 2020-03-11 17:50
 */
public class Client {
    public static void main(String[] args) {
        RubbishHandler rubbishHandler = new RubbishHandler();
        NegativeHanlder negativeHanlder = new NegativeHanlder();
        rubbishHandler.setHandler(negativeHanlder);

        rubbishHandler.handlerRequest("aa");

    }
}
