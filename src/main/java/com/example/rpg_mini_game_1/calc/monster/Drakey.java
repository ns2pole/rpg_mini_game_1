package com.example.rpg_mini_game_1.calc.monster;

public class Drakey extends Monster {
    public Drakey() {
        this.name = "ドラキー";
        this.hp = 100;
        this.mp = 50;
    }

    public void attack(Monster m) {
        System.out.print(this.name + "の攻撃  ");
        System.out.println(m.name + "に30のダメージ");
        m.hp -= 30;
        if(m.hp <= 0) {
            System.out.println(m.name + "は倒れた");
        }
    }

    public void magicAttack(Monster m) {
        System.out.print(this.name + "の攻撃  ");
        System.out.println(m.name + "に30のダメージ");
        m.hp -= 30;
        this.mp -= 10;
        if(m.hp <= 0) {
            System.out.println(m.name + "は倒れた");
        }
    }



}
