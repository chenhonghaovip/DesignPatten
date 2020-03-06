package com.test.single;

import com.test.builderpatten.WaybillBcListDetail;
import com.test.dto.CentralizedReceiveDTO;

import java.time.Period;
import java.util.Arrays;

/**
 * 场景类
 *
 * @author chenhonghao
 * @date 2020-03-05 09:54
 */
public class Client {
    public static void main(String[] args) {
        SingleFactory singleFactory = new SingleFactory();
        WaybillBcListDetail waybillBcListDetail = singleFactory.getSingle(WaybillBcListDetail.class);

        CentralizedReceiveDTO centralizedReceiveDTO = singleFactory.getSingle(CentralizedReceiveDTO.class);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("1");
        String[] strings = {"1","3","5"};
        String[] copys = Arrays.copyOf(strings,10);
        System.out.println(copys.length);
    }
}
