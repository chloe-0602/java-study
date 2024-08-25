package com.chloe.java.demo;

import java.util.Scanner;

/**
 * 大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
 *
 * 如果这三个条件同时满足，则：“我一定要嫁给他!!!”
 * 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
 * 如果三个条件都不满足，则：“不嫁！”
 */
public class ScannerExer2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入你的身高：(cm)");
        int height = scan.nextInt();

        System.out.println("请输入你的财富：(以千万为单位)");
        double wealth = scan.nextDouble();

		/*

		方式1：关于是否帅问题，我们使用boolean类型接收

		System.out.println("帅否？(true/false)");
		boolean isHandsome = scan.nextBoolean();

		//判断
		if(height >= 180 && wealth >= 1.0 && isHandsome){ //不建议isHandsome == true
			System.out.println("我一定要嫁给他!!!");
		}else if(height >= 180 || wealth >= 1.0 || isHandsome){
			System.out.println("嫁吧，比上不足，比下有余。");
		}else{
			System.out.println("不嫁");
		}

		*/

        //方式2：关于是否帅问题，我们使用String类型接收
        System.out.println("帅否？(是/否)");
        String isHandsome = scan.next();

        //判断
        if(height >= 180 && wealth >= 1.0 && isHandsome == "是"){  //知识点：判断两个字符串是否相等，使用String的equals()
            System.out.println("我一定要嫁给他!!!");
        }else if(height >= 180 || wealth >= 1.0 || isHandsome == "是"){
            System.out.println("嫁吧，比上不足，比下有余。");
        }else{
            System.out.println("不嫁");
        }

        //关闭资源
        scan.close();
    }
}
