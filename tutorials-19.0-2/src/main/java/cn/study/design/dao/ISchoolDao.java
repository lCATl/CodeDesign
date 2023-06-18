package cn.study.design.dao;

import cn.study.design.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);

}
