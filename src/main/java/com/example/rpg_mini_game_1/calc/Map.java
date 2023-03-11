package com.example.rpg_mini_game_1.calc;

import java.util.ArrayList;
public class Map {
    public int Width;
    public int Height;
    public TreasureBox[] TreasureBoxes;

    public Map(int Width, int Height, TreasureBox[] TreasureBoxes) {
        this.Width = Width;
        this.Height = Height;
        this.TreasureBoxes = TreasureBoxes;
    }
}
