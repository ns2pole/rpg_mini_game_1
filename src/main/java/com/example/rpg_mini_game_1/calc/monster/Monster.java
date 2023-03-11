package com.example.rpg_mini_game_1.calc.monster;

import com.example.rpg_mini_game_1.calc.EventManager;
import com.example.rpg_mini_game_1.calc.Person;

public abstract class Monster {
    public String name;
    public int hp;
    public int mp;

    public Monster() {
    }

    public static Monster getMonster() {
        int num = EventManager.getNumber(0, 2);
        switch (num) {
            case 0:
                return new Slime();
            case 1:
                return new Awk();
            case 2:
                return new Drakey();
            default:
                return null;
        }
    }

    public void battle(Monster m) {
        System.out.println("戦闘が始まりました");
        while (this.hp > 0 || m.hp > 0) {
            System.out.println(this.name + "のHP:" + this.hp);
            this.attack(m);
            m.attack(this);
            System.out.println(this.name + "のHP:" + this.hp);
        }
        System.out.println("戦闘が終了しました");
    }

    public void battle(Person p) {
        System.out.println(this.name + "との戦闘が始まりました");

        for(Monster m : p.monsters) {
            while (this.hp > 0 && m.hp > 0) {
                System.out.println(this.name + "のHP:" + this.hp);
                System.out.println(m.name + "のHP:" + m.hp);
                this.attack(m);
                m.attack(this);
                System.out.println(this.name + "のHP:" + this.hp);
                System.out.println(m.name + "のHP:" + m.hp);
                System.out.println();
            }
            if(m.hp <= 0) {
                System.out.println("闘うモンスター変更");
            }
            if(this.hp <= 0 ) {
                break;
            }
        }
        System.out.println("戦闘が終了しました");
    }
    

    abstract public void attack(Monster m);
//    abstract public void magicAttack(Monster m);


}
