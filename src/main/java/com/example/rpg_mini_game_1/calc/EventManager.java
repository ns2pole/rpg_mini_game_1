package com.example.rpg_mini_game_1.calc;

import com.example.rpg_mini_game_1.calc.monster.*;

public class EventManager {
    public static void event(Person p) {
        System.out.println(p.getMonsterStatus());
        if(dize()) {
            Monster m = new Awk();
            System.out.println(m.name + "が現れた。");
            m.battle(p);
        }
        System.out.println(p.getMonsterStatus());
    }



    public static boolean dize() {
        int dize = (int)(Math.random() * 100);
        if(dize < 50) {
            return true;
        } else {
            return false;
        }
    }

    public static int getNumber(int from,int to) {
        int number = (int)(Math.random() * (to - from + 1)) + from;
        return number;
    }

    
}
