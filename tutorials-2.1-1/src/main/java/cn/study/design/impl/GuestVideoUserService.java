package cn.study.design.impl;

import cn.study.design.IVideoUserService;

/**
 * @description: 访客用户
 * @author: CAT
 * @Copyright: CodeDesign
 */
public class GuestVideoUserService implements IVideoUserService {

    public void definition() {
        System.out.println("访客用户，视频480P高清");
    }

    public void advertisement() {
        System.out.println("访客用户，视频有广告");
    }

}
