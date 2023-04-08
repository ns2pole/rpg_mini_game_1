package com.example.rpg_mini_game_1.calc.monster;

public class Drakey extends Monster {
    int magicPower;
    public Drakey() {
        this.name = "ドラキー";
        this.hp = 100;
        this.mp = 50;
        this.magicPower = 10;
    }

    //attackでランダム性を持たせる 普通のattackはphysical attackに名称変更。

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
        System.out.println(m.name + "に" + this.magicPower + "のダメージ");
        if(this.mp < 10) {
            System.out.println("しかしMPが足りない。");
        } else {
            m.hp -= 30;
            this.mp -= 10;
            if(m.hp <= 0) {
                System.out.println(m.name + "は倒れた");
            }
        }
    }



}
