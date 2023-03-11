package com.example.rpg_mini_game_1.calc;

import com.example.rpg_mini_game_1.calc.monster.Monster;

import java.util.ArrayList;
public class Person {
    public String name;
    public Position position = new Position(0, 0);
    public ArrayList<Monster> monsters;

    public Person(String name, ArrayList<Monster> monsters) {
        this.name = name;
        this.monsters = monsters;
    }

    public void moveUp() {
        this.position.x++;
    }

    public void moveDown() {
        this.position.x--;
    }

    public void moveRight() {
        this.position.y++;
    }

    public void moveLeft() {
        this.position.y--;
    }

    public void investigate(TreasureBox[] treasureBoxes) {
        for (TreasureBox treasureBox : treasureBoxes) {
            if (treasureBox.position == this.position) {
                System.out.println("宝箱があります");
                System.out.println("中身は" + treasureBox.inside + "でした");
            } else {
            }
        }
    }

    public String getMonsterStatus() {
        String status = "";
        for (Monster m : this.monsters) {
            status += m.name + "のHP:" + m.hp + " ";
        }
        return status;
    }
}
