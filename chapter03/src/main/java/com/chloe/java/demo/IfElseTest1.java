package com.chloe.java.demo;

public class IfElseTest1 {
    public static void main(String[] args) {
        /**
         * **案例1：**成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。
         */
        int heartBeats = 89;
        if(heartBeats < 60 || heartBeats > 100){
            System.out.println("你需要做进一步的检查");
        }

        System.out.println("体检结束");
    }
}
