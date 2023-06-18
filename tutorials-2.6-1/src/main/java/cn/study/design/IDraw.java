package cn.study.design;

import java.util.List;

/**
 * @author CAT
 * @description 抽奖接口
 * @Copyright CodeDesign
 */
public interface IDraw {

    List<BetUser> prize(List<BetUser> list, int count);

}
