package cn.study.design.test;

import cn.study.design.IVideoUserService;
import cn.study.design.impl.GuestVideoUserService;

/**
 * @description:
 * @author: CAT
 * @Copyright: 单一职责原则
 */
public class ApiTest {

    public static void main(String[] args) {
        IVideoUserService guest = new GuestVideoUserService();
        guest.advertisement();
        guest.definition();
        // 其他两个，自己补充
    }

}
