package com.test.duty;

/**
 * 规范
 *
 * @author chenhonghao
 * @date 2020-03-11 17:46
 */
public abstract class Handler {
    /**
     * 上级人员信息
     */
    public Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    abstract String  handlerRequest(String msgChain);
}
