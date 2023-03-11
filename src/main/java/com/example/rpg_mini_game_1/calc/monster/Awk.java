package com.example.rpg_mini_game_1.calc.monster;

public class Awk extends Monster {
    public Awk() {
        this.name = "オーク";
        this.hp = 200;
    }

    public void attack(Monster m) {
        System.out.print(this.name + "の攻撃  ");
        System.out.println(m.name + "に30のダメージ");
        m.hp -= 30;
        if(m.hp <= 0) {
            System.out.println(m.name + "は倒れた");
        }
    }

}
