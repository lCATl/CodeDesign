package cn.study.design.imp;

import cn.study.design.ICouponDiscount;

import java.math.BigDecimal;

/**
 * Create by CAT
 *
 * n元购买
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }

}
