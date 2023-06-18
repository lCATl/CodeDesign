package cn.study.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @author CAT
 * @description 模拟实物商品服务
 * @Copyright CodeDesign
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }

}
