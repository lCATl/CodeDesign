package cn.study.design;

import cn.study.design.agent.Select;

public interface IUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}