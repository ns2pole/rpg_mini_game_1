import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TreasureBox[] treasureBoxes = new TreasureBox[3];
        treasureBoxes[0] = new TreasureBox(new Position(6, 6), "銅貨", new Monster("スライム"));
        treasureBoxes[1] = new TreasureBox(new Position(2, 6), "銀貨", new Monster("スライム"));
        treasureBoxes[2] = new TreasureBox(new Position(4, 6), "金貨", new Monster("スライム"));
        Map map = new Map(8, 8, treasureBoxes);
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(new Monster("ドラキー"));
        Person person = new Person("勇者", monsters);
        // ViewManager.draw(map);
    }
}
