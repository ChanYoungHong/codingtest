package StandardOfJava.chapter7;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutaCard[] cards = new SutaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < cards.length; i++) {
            int num = i%10+1;
            boolean isKwang = (i < 10) && (num==1||num==3||num==8);

            cards[i] = new SutaCard(num, isKwang);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {


        }
    }

    SutaCard pick(int index) {
        for (int i = 0; i < cards.length; i++) {
            if(i == index){
                cards[i] = cards[index];
            }
        }

        return null;
    }

    SutaCard pick() {


        return null;
    }
}

class SutaCard {
    int num;
    boolean isKwang;

    SutaCard() {
        this(1, true);
    }

    public SutaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}




public class problem7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
