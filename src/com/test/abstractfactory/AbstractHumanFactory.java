package com.test.abstractfactory;

/**
 * 抽象人类工厂
 *
 * @author chenhonghao
 * @date 2020-03-04 15:11
 */
public abstract class AbstractHumanFactory {

    /**
     * 给定一个性别人种，创建一个人类出来 专业术语是产生产品等级
     * @param t class
     * @return T
     */
    public abstract <T extends Human> T createHuman(Class<T> t) ;

}
