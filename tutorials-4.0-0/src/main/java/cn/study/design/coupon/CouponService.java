package cn.study.design.coupon;

/**
 * @author CAT
 * @description 模拟优惠券服务
 * @Copyright CodeDesign
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
