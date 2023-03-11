package com.example.rpg_mini_game_1.calc;

public abstract class Monster {
    public String name;
    public int hp;
    public int mp;

    public Monster() {
        this.hp = 100;
        this.mp = 100;
    }

    public abstract void attack(Monster m) {
        System.out.print(this.name + "の攻撃  ");
        System.out.println(m.name + "に30のダメージ");
        m.hp -= 30;
        if(m.hp <= 0) {
            System.out.println(m.name + "は倒れた");
        }
    }

    public abstract magicAttack(Monster m) {
        System.out.print(this.name + "の魔法攻撃  ");
        System.out.println(m.name + "に50のダメージ");
        m.hp -= 50;
        this.mp -= 30;
        if(m.hp <= 0) {
            System.out.println(m.name + "は倒れた");
        }
    }


}
