package cn.study.design;

import java.math.BigDecimal;

/**
 * @author CAT
 * @description 优惠券折扣计算接口
 * @Copyright CodeDesign
 */
public interface ICouponDiscount<T> {

    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);

}
