package cn.study.design.test;

import cn.study.design.Cmd;

/**
 * @author CAT
 * @description program arguments：-version
 * @Copyright CodeDesign
 * 运行在启动时传入参数
 */
public class ApiTest {

    public static void main(String[] args) {
        Cmd cmd = Cmd.parse(args);
        if (!cmd.ok || cmd.helpFlag) {
            System.out.println("Usage: <main class> [-options] class [args...]");
            return;
        }
        if (cmd.versionFlag) {
            System.out.println("java version \"1.8.0\"");
        }
    }

}
