package cn.study.design.door.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

/**
 * 切面定义
 * Create by CAT
 *
 * itstack:
 *   door:
 *     enabled: true
 *     userStr: 1001,aaaa,ccc #白名单用户ID，多个逗号隔开
 */
public class StarterService {

    private String userStr;

    public StarterService(){

    }

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }

}
