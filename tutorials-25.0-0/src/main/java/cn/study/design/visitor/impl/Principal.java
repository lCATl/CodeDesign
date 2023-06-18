package cn.study.design.visitor.impl;

import cn.study.design.user.impl.Student;
import cn.study.design.user.impl.Teacher;
import cn.study.design.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author CAT
 * @description 校长
 * @Copyright CodeDesign
 */
public class Principal implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Principal.class);

    @Override
    public void visit(Student student) {
        logger.info("学生信息 班级：{} 人数：{}", student.clazz, student.count());
    }

    @Override
    public void visit(Teacher teacher) {
        logger.info("学生信息 姓名：{} 班级：{} 升学率：{}", teacher.name, teacher.clazz, teacher.entranceRatio());
    }

}
