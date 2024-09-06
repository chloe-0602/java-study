package com.atguigu06.collections.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName: PokerTest
 * Package: com.atguigu06.collections.exer
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/6 11:13
 * @Version 1.0
 */
public class PokerTest {
    @Test
    public void test1() {
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"方片♦", "梅花♣", "红桃♥", "黑桃♠"};
        ArrayList poker = new ArrayList();

        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(color[i] + " " + num[j]);
            }
        }
        poker.add("大王");
        poker.add("小王");

        Collections.shuffle(poker);

        ArrayList tom = new ArrayList();
        ArrayList jerry = new ArrayList();
        ArrayList me = new ArrayList();
        ArrayList lastCards = new ArrayList();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                lastCards.add(poker.get(i));
            } else if (i % 3 == 0) {
                tom.add(poker.get(i));
            } else if (i % 3 == 1) {
                jerry.add(poker.get(i));
            } else if (i % 3 == 2) {
                me.add(poker.get(i));
            }
        }

        System.out.println("Tom:");
        System.out.println(tom);

        System.out.println("Jerry:");
        System.out.println(jerry);

        System.out.println("Me:");
        System.out.println(me);

        System.out.println("底牌:");
        System.out.println(lastCards);
    }
}
