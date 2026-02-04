package Part103;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card>{

    private int value;
    private Suit suit;

    public Card(int value, Suit suit){
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public String toString(){
        Map<Integer, String> highCards = new HashMap<>();

        highCards.put(11,"JOPEK");
        highCards.put(12,"DAMA");
        highCards.put(13,"KING");
        highCards.put(14,"ACE");

        String cardName = "";
        int num = this.value;

        if(num > 10){
            cardName = highCards.get(num);
            return suit+" "+cardName;
        }
        else {
            return suit+" "+num;
        }

    }

    public int compareTo(Card card){

        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue())
                .thenComparing(Card::getSuit());

        return comparator;
    }
}
