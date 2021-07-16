package com.hp.collection;

import java.util.*;

/**
 *   牌数 54张 ，大王 小王 A 2-10 J,Q,k 四个桃
 *   ♥ ♠ ♣ ♦
 */
public class DdzTest {
    public static void main(String[] args) {
            //1。先造出 4个花色
            List<String> colors = new ArrayList<>();
            colors.add("♥");
            colors.add("♠");
            colors.add("♣");
            colors.add("♦");
            //2. 造出 十个 2-10
            List<String > nums = new ArrayList<>();
            for (int i = 2; i <= 10; i++) {
                nums.add(i+"");
            }
                nums.add("J");
                nums.add("Q");
                nums.add("K");
                nums.add("A");
        //  System.out.println("nums = " + nums);

            //3. 上面的 colors 和 nums 进行一个 整合
            //  放入到一个新的集合中
            List<String> piker = new ArrayList<>();
            //Set<String> piker = new HashSet<>();
            for (String color : colors) {
                for (String num : nums) {
                        piker.add(color+num);
                }
            }
            piker.add("大王");
            piker.add("小王");
          //  System.out.println("piker = " + piker);
            System.out.println("piker = " + piker.size());

            // 如果 使用set 也无法分开排序, 有个方法可以打乱排序
            // 只能打断list集合 以为set是无序的
            Collections.shuffle(piker);
            System.out.println("piker = " + piker);//打断list的排序 学名洗牌
      //      Collections.sort(piker);
     //       System.out.println("piker = " + piker);//list的快速排序(不是人工制定的排序)
            // 给 player1 player2 player3 发牌.
            List<String> player1 = new ArrayList<>();   //玩家1
            List<String> player2 = new ArrayList<>();   //玩家2
            List<String> player3 = new ArrayList<>();   //玩家3
            List<String> dipai = new ArrayList<>();     // 底牌三张
        for (int i = 0; i < piker.size(); i++) {
            String pName = piker.get(i); //每张扑克牌.
            if (i >= 51) {// 埋最后三张底牌
                dipai.add(pName);
            } else {
                // 给玩家1,2,3 发最后51 张牌
                if (i % 3 == 0) {
                         player1.add(pName);
                }   else if (i % 3 == 1) {
                         player2.add(pName);
                }else{
                         player3.add(pName);
                }
            }
        }
        System.out.println("dp = " + dipai);
        System.out.println("player1 = " + player1);
        System.out.println("player2 = " + player2);
        System.out.println("player3 = " + player3);

         //规定一个地主  1.规定:红桃3 谁是地主,  底牌里面不能包含红桃3.

    }
}
