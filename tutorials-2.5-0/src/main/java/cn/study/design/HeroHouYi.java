package cn.study.design;

/**
 * @description 王者英雄，后裔
 * @author CAT
 * @Copyright CodeDesign
 */
public class HeroHouYi implements ISkill{

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

    @Override
    public void doVertigo() {
        // 无此技能的实现
    }

}
