package Part103;

import java.util.ArrayList;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        this.hand.add(card);
    }

    public void print(){
        hand.forEach(System.out::println);
    }

    public void sort(){
        this.hand.sort(Card::compareTo);
    }

    public int compareTo(Hand hand){
        int a = 0;
        a = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0,(prevVal, val)-> prevVal+val);

        int b = 0;
        b= hand.hand.stream()
                .map(card -> card.getValue())
                .reduce(0,(prevVal, val)-> prevVal+val);

        return  a-b;
    }

}
