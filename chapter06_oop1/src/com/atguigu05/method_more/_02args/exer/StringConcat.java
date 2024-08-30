package com.atguigu05.method_more._02args.exer;

/**
 * ClassName: StringConcat
 * Package: com.atguigu05.method_more._02args.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/8/30 8:22
 * @Version 1.0
 */
public class StringConcat {
    public static void main(String[] args) {
        StringConcat stringConcat = new StringConcat();
        stringConcat.concat("-");
        stringConcat.concat("-", "hello");
        stringConcat.concat("-", "hello", "world");
    }

    public String concat(String operator, String ...args){
        String res = "";
        for (int i = 0; i < args.length; i++) {
            if(0== i){
                res += args[i];
            }else {
                res += (operator + args[i]);
            }
        }
        System.out.println(res);
        return res;
    }
}
