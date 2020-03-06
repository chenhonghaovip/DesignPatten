package com.test.abstractfactory;

/**
 * 女性工厂，只创建女性
 *
 * @author chenhonghao
 * @date 2020-03-04 15:13
 */
public class HumanFactory extends AbstractHumanFactory{

    @Override
    public <T extends Human> T createHuman(Class<T> t) {
        Human human = null;
        try {
            human = (Human) Class.forName(t.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)human;
    }
}
