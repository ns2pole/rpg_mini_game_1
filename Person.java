import java.util.ArrayList;
public class Person {
    public String name;
    public String seibetu;
    public Position position = new Position(0, 0);
    public ArrayList<Monster> monsters;
    
    public Person(String name, String seibetu, int position) {
        this.name = name;
        this.seibetu = seibetu;
        this.position = position;
    }

    public void move() {
        this.position.x++;
        this.position.y++;
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
}
