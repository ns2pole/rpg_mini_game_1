import java.util.ArrayList;
public class Map {
    public int Width;
    public int Height;
    public TreasureBox[] TreasureBoxes;
    public startPositionX = 0;
    public startPositionY = 0;
    public Map(int Width, int Height, TreasureBox[] TreasureBoxes) {
        this.Width = Width;
        this.Height = Height;
        this.TreasureBoxes = TreasureBoxes;
    }
}
