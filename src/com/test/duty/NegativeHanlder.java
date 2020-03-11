package com.test.duty;

/**
 * 处理负面新闻的大妮
 *
 * @author chenhonghao
 * @date 2020-03-11 17:51
 */
public class NegativeHanlder extends Handler{
    @Override
    String handlerRequest(String msgChain) {
        if (msgChain.contains("bb")){
            System.out.println("处理负面新闻的大妮");
            return "处理负面新闻的大妮";
        }
        if (handler!=null){
            return handler.handlerRequest(msgChain);
        }else {
            System.out.println("error");
            return "error";
        }
    }
}
