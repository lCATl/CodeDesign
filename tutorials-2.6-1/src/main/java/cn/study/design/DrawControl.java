package cn.study.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author CAT
 * @description 抽奖控制
 * @Copyright CodeDesign
 */
public class DrawControl {

    private IDraw draw;

    public List<BetUser> doDraw(IDraw draw, List<BetUser> betUserList, int count) {
        return draw.prize(betUserList, count);
    }

}
