package Chapter07.Ex21;

class Product{
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

}

class Tv extends Product {
    Tv(){
        super(100);
    }

    public String toString(){
        return "Tv";
    }

}

class Computer extends Product{
    Computer(){
        super(200);
    }

    public String toString(){
        return "Computer";
    }
}

class Buyer{
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p){
        if (money < p.price) {
            System.out.println("잔액이 부족하여 못산다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "구입함");
    }

}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("b.money = " + b.money);
        System.out.println("b.bonusPoint = " + b.bonusPoint);

    }
}
