package cn.study.design.impl;

import cn.study.design.IVideoUserService;

/**
 * @description: VIP 用户
 * @author: CAT
 * @Copyright: CodeDesign
 */
public class VipVideoUserService implements IVideoUserService {

    public void definition() {
        System.out.println("VIP用户，视频1080P蓝光");
    }

    public void advertisement() {
        System.out.println("VIP会员，视频无广告");
    }
}
