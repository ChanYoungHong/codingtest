package StandardOfJava.chapter7;


class SutdaCard {

    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }

}



public class problem7_14 {
    public static void main(String[] args) {
        SutdaCard card = new SutdaCard(1, true);
    }
}
