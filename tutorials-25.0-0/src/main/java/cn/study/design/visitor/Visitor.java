package cn.study.design.visitor;

import cn.study.design.user.impl.Student;
import cn.study.design.user.impl.Teacher;

/**
 * @author CAT
 * @description 访问者接口
 * @Copyright CodeDesign
 */
public interface Visitor {

    // 访问学生信息
    void visit(Student student);

    // 访问老师信息
    void visit(Teacher teacher);

}
