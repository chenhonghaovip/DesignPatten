package com.test.observer;

/**
 * 抽象被观察者
 *
 * @author chenhonghao
 * @date 2020-03-11 15:31
 */
public interface Observerable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
