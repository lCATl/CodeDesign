package cn.study.design.store;

import java.util.Map;

/**
 * @author CAT
 * @description 发放商品接口
 * @Copyright CodeDesign
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
