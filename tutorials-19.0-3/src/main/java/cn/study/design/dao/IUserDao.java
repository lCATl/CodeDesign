package cn.study.design.dao;

import cn.study.design.po.User;

public interface IUserDao {

     User queryUserInfoById(Long id);

}
