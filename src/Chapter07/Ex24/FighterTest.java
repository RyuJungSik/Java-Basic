package Chapter07.Ex24;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("f 는 Unit클래스의 자손압니다.");
        }
        if (f instanceof Fightable) {
            System.out.println("f 는 Fightable 자손압니다.");
        }

        if (f instanceof Movable) {
            System.out.println("f 는 Movable 자손압니다.");
        }

        if (f instanceof Attackable) {
            System.out.println("f 는 Attackable 자손압니다.");
        }

        if (f instanceof Object) {
            System.out.println("f 는 Object클래스의 자손압니다.");
        }

    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y){}
    public void attack(Unit u){}
}


class Unit{
    int currentHP;
    int x;
    int y;
}

interface Movable{
    void move(int x, int y);
}

interface Attackable{
    void attack(Unit u);
}

interface Fightable extends Movable, Attackable {}