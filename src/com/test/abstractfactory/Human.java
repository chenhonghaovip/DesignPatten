package com.test.abstractfactory;

/**
 * 定义一个人类的统称，问题出来了，刚刚定义的时候忘记定义性别了
 * 这个重要的问题非修改不可，否则这个世界上太多太多的东西不存在了
 *
 * @author chenhonghao
 * @date 2020-03-04 13:33
 */
public interface Human {
    // 人会笑，表达愉快
    void laugh();

    // 人会哭，表达悲伤
    void cry();

    // 人会说话
    void talk();

    // 定义性别
    void sex();
}
