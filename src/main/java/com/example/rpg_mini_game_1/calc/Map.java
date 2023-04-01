package com.example.rpg_mini_game_1.calc;

import java.util.ArrayList;
public class Map {
    public int width;
    public int height;
    public TreasureBox[] treasureBoxes;

    public Map(int width, int height, TreasureBox[] treasureBoxes) {
        this.width = width;
        this.height = height;
        this.treasureBoxes = treasureBoxes;
    }
}
