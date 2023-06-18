package cn.study.design.impl;

import cn.study.design.ISkillArchery;
import cn.study.design.ISkillInvisible;
import cn.study.design.ISkillSilent;

/**
 * @author CAT
 * @description 王者英雄，后裔
 * @Copyright CodeDesign
 */
public class HeroHouYi implements ISkillArchery, ISkillInvisible, ISkillSilent {

    @Override
    public void doArchery() {
        System.out.println("后裔的灼日之矢");
    }

    @Override
    public void doInvisible() {
        System.out.println("后裔的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("后裔的沉默技能");
    }

}
