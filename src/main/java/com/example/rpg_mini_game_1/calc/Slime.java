public class Slime extends Monster {
    public Slime() {
        this.name = "スライム";
        this.hp = 100;
        this.mp = 100;
    }

    public void attack(Monster m) {
        System.out.print(this.name + "の攻撃  ");
        System.out.println(m.name + "に30のダメージ");
        m.hp -= 30;
        if(m.hp <= 0) {
            System.out.println(m.name + "は倒れた");
        }
    }
}
