package cn.study.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 老师
 * @author: CAT
 * @Copyright: CodeDesign
 */
public class Teacher {

    private String name;                // 老师名称
    private String clazz;               // 班级
    private static List<Student> studentList;  // 学生

    public Teacher() {
    }

    public Teacher(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
    }

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("花花", 10, 589));
        studentList.add(new Student("豆豆", 54, 356));
        studentList.add(new Student("秋雅", 23, 439));
        studentList.add(new Student("皮皮", 2, 665));
        studentList.add(new Student("蛋蛋", 19, 502));
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }
}
