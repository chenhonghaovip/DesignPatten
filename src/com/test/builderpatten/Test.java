package com.test.builderpatten;

/**
 * @author chenhonghao
 * @date 2020-03-04 16:29
 */
public class Test {
    public static void main(String[] args) {
        WaybillBcList waybillBcList = new WaybillBcList.Builder().batchId("111").shopId("22").build();
        System.out.println(waybillBcList);

        WaybillBcListDetail waybillBcListDetail = new WaybillBcListDetail.Builder().id("1").build();
        StringBuilder stringBuilder = new StringBuilder().append(1).append(2).append("12").append(2);
    }
}
