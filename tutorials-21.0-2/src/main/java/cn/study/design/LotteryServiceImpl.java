package cn.study.design;

import java.util.Date;

/**
 * @author CAT
 * @description 摇号服务实现
 * @Copyright CodeDesign
 */
public class LotteryServiceImpl extends LotteryService{

    private MinibusTargetService minibusTargetService = new MinibusTargetService();

    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }

}
