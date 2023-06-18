package cn.study.design.test;

import cn.study.design.group.Employee;
import cn.study.design.group.GroupStructure;
import cn.study.design.group.Link;
import cn.study.design.lang.Iterator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author CAT
 * @description 遍历测试
 * @date 2022/5/3
 * @github https://github.com/fuzhengwei/CodeDesignTutorials
 * @Copyright CodeDesign
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_iterator() {
        GroupStructure groupStructure = new GroupStructure("1", "CAT");
        groupStructure.add(new Employee("2", "花花", "二级部门"));
        groupStructure.add(new Employee("3", "豆包", "二级部门"));
        groupStructure.add(new Employee("4", "蹦蹦", "三级部门"));
        groupStructure.add(new Employee("5", "大烧", "三级部门"));
        groupStructure.add(new Employee("6", "虎哥", "四级部门"));
        groupStructure.add(new Employee("7", "玲姐", "四级部门"));
        groupStructure.add(new Employee("8", "秋雅", "四级部门"));

        groupStructure.addLink("1", new Link("1", "2"));
        groupStructure.addLink("1", new Link("1", "3"));

        groupStructure.addLink("2", new Link("2", "4"));
        groupStructure.addLink("2", new Link("2", "5"));

        groupStructure.addLink("5", new Link("5", "6"));
        groupStructure.addLink("5", new Link("5", "7"));
        groupStructure.addLink("5", new Link("5", "8"));

        Iterator<Employee> iterator = groupStructure.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            logger.info("{} 雇员 ID：{} Name：{}", employee.getDesc(), employee.getuId(), employee.getName());
        }

    }

}
