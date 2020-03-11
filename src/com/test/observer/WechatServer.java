package com.test.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者(一个)
 *
 * @author chenhonghao
 * @date 2020-03-11 15:32
 */
public class WechatServer implements Observerable{
    private List<Observer> list ;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    WechatServer(String message) {
        list = new ArrayList<>();
        this.message = message;
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty()){
            list.remove(o);
        }

    }

    @Override
    public void notifyObserver() {
        if (!list.isEmpty()){
            list.forEach(each->each.update(message));
        }

    }
}
