package StandardOfJava.chapter7;

public class problem7_19 {

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer1());
        b.buy(new Tv1());
        b.buy(new Audio1());
        b.buy(new Computer1());
        b.buy(new Computer1());
        b.buy(new Computer1());

        b.summary();
    }

}

class Buyer {
    int money = 1000;
    Product1[] cart = new Product1[3];
    int i = 0;

    void buy(Product1 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 " + p + "을/를 살수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product1 p) {

        if (i >= cart.length) {
            Product1[] tmp = new Product1[cart.length * 2];
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            cart = tmp;
        }

        cart[i++] = p;
    }

    void summary() {
        String itemList = "";
        int sum = 0;

        for (int j = 0; j < cart.length; j++) {
            if (cart[j] == null) {
                break;
            }
            itemList += cart[j] + ",";
            sum += cart[j].price;

        }

        System.out.println("구입한 물건 : "+ itemList);
        System.out.println("사용한 금액 : "+ sum);
        System.out.println("남은 금액 : "+ money);

    }
}

class Product1 {

    public Product1(int price) {
        this.price = price;
    }

    int price;

}

class Tv1 extends Product1 {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer1 extends Product1 {
    Computer1() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio1 extends Product1 {

    Audio1() {
        super(50);
    }

    public String toString() {

        return "Audio";
    }
}