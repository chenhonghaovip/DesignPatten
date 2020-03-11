package com.test.duty;

/**
 * 处理垃圾信息的管家
 *
 * @author chenhonghao
 * @date 2020-03-11 17:47
 */
public class RubbishHandler extends Handler{
    @Override
    String handlerRequest(String msgChain) {
        if (msgChain.contains("aa")){
            System.out.println("处理垃圾信息的管家");
            return "处理垃圾信息的管家";
        }
        return handler.handlerRequest(msgChain);
    }
}
