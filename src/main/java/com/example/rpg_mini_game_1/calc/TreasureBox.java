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
