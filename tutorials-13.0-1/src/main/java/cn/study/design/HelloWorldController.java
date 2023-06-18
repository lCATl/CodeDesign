package cn.study.design;


import cn.study.design.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldController {

    public UserInfo queryUserInfo(@RequestParam String userId) {

        // 做白名单拦截
        List<String> userList = new ArrayList<String>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");
        if (!userList.contains(userId)) {
            return new UserInfo("1111", "非白名单可访问用户拦截！");
        }

        return new UserInfo("CAT:" + userId, 19, "宇宙太阳系地球中国");
    }

}
