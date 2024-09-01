package com.atguigu03.main;

/**
 * ClassName: CommandPara
 * Package: com.atguigu03.main
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/1 14:25
 * @Version 1.0
 */
public class CommandPara {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
