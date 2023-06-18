package cn.study.design.impl;

import cn.study.design.OrderAdapterService;
import cn.study.design.service.POPOrderService;

/**
 * 第三方订单，判断首单逻辑
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }

}
