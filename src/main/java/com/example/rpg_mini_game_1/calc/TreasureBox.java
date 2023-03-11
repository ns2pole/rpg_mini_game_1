package com.example.rpg_mini_game_1.calc;

import com.example.rpg_mini_game_1.calc.monster.Monster;

import java.util.ArrayList;
public class TreasureBox {
    public Position position;
    public String inside;
    public Monster monster;
    public TreasureBox(Position position, String inside, Monster monster) {
        this.position = position;
        this.inside = inside;
        this.monster = monster;
    }
}
