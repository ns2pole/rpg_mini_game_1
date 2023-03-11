package com.example.rpg_mini_game_1.calc;
import com.example.rpg_mini_game_1.calc.monster.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        TreasureBox[] treasureBoxes = new TreasureBox[3];
        treasureBoxes[0] = new TreasureBox(new Position(6, 6), "銅貨", new Slime());
        treasureBoxes[1] = new TreasureBox(new Position(2, 6), "銀貨", new Awk());
        treasureBoxes[2] = new TreasureBox(new Position(4, 6), "金貨", new Drakey());
        Map map = new Map(8, 8, treasureBoxes);
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Slime());
        monsters.add(new Drakey());
        Person person = new Person("勇者", monsters);
        EventManager.event(person);
    }
}
