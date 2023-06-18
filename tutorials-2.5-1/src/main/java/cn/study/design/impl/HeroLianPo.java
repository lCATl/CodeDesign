package cn.study.design.impl;

import cn.study.design.ISkillInvisible;
import cn.study.design.ISkillSilent;
import cn.study.design.ISkillVertigo;

/**
 * @author CAT
 * @description 王者英雄，廉颇
 * @Copyright CodeDesign
 */
public class HeroLianPo implements ISkillInvisible, ISkillSilent, ISkillVertigo {

    @Override
    public void doInvisible() {
        System.out.println("廉颇的隐身技能");
    }

    @Override
    public void doSilent() {
        System.out.println("廉颇的沉默技能");
    }

    @Override
    public void doVertigo() {
        System.out.println("廉颇的眩晕技能");
    }

}
