package com.test.adapter;

/**
 * @author chenhonghao
 * @date 2020-03-05 11:22
 */
public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee1Impl(new TargetImpl());
        adaptee.getInfos();
    }
}
//    public static void main(String[] args) {
//        Adaptee adaptee = new AdapteeImpl();
//        adaptee.getInfos();
//    }
//}
