package cn.study.design;

import cn.study.design.event.EventManager;
import cn.study.design.event.listener.MQEventListener;
import cn.study.design.event.listener.MessageEventListener;

/**
 * @author CAT
 * @description 摇号服务抽象类，也可以创建接口，在用抽象类实现
 * @Copyright CodeDesign
 */
public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService() {
        eventManager = new EventManager(EventManager.EventType.MQ, EventManager.EventType.Message);
        eventManager.subscribe(EventManager.EventType.MQ, new MQEventListener());
        eventManager.subscribe(EventManager.EventType.Message, new MessageEventListener());
    }

    public LotteryResult draw(String uId) {
        LotteryResult lotteryResult = doDraw(uId);
        eventManager.notify(EventManager.EventType.MQ, lotteryResult);
        eventManager.notify(EventManager.EventType.Message, lotteryResult);
        return lotteryResult;
    }

    protected abstract LotteryResult doDraw(String uId);

}
