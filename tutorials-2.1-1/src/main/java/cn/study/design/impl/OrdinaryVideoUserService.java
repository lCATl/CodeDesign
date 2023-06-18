package cn.study.design.impl;

import cn.study.design.IVideoUserService;

/**
 * @description: 普通用户
 * @author: CAT
 * @Copyright: CodeDesign
 */
public class OrdinaryVideoUserService implements IVideoUserService {

    public void definition() {
        System.out.println("普通用户，视频720P超清");
    }

    public void advertisement() {
        System.out.println("普通用户，视频有广告");
    }
}
