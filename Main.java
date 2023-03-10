import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("勇者", "男", 4);
        Monster m1 = new Monster("スライム1");
        Monster m2 = new Monster("スライム2");
        m1.attack(m2);
        m2.attack(m1);
        m1.magicAttack(m2);
        m2.magicAttack(m1);
        m1.magicAttack(m2);
        // Map map = new Map();
        // map.TreasureBoxes = new TreasureBox[3];
        // map.TreasureBoxes[0] = new TreasureBox(4 ,"Sword");
        // map.TreasureBoxes[1] = new TreasureBox(5 ,"Shield");
        // map.TreasureBoxes[2] = new TreasureBox(6 ,"Potion");
        // Person p = new Person("勇者", "男", 4);
        // p.investigate(map);
        // p.move();
        // p.investigate(map);
        // p.move();
        // p.investigate(map);
        // p.move();
        // p.investigate(map);
        // p.move();
        // p.investigate(map);
        // p.move();
        // p.investigate(map);
    
    }
}
