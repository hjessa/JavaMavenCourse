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


        String cardName = "";
        int num = this.value;

        if(num > 10){
            cardName = CardValueName.fromValue(num).toString();
            return suit+" "+cardName;
        }
        else {
            return suit+" "+num;
        }

    }
    public int compareTo(Card card){
        int result = this.value - card.value;

        if(result == 0){
            result = this.suit.ordinal() - card.suit.ordinal();
        }
        return result;

    }


}
