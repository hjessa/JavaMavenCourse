package Part103;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        Hand hand = new Hand();

        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(4, Suit.SPADE));
        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(7, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.sortBySuit();

        hand.print();
//        ArrayList<Card> cards = new ArrayList<>();
//
//        cards.add(new Card(3, Suit.SPADE));
//        cards.add(new Card(2, Suit.DIAMOND));
//        cards.add(new Card(14, Suit.SPADE));
//        cards.add(new Card(12, Suit.HEART));
//        cards.add(new Card(2, Suit.SPADE));
//
//        Collections.sort(cards, new SortBySuitInValueOrder());
//
//        cards.stream().forEach(c -> System.out.println(c));
//        Employees university = new Employees();
//        university.add(new Person("Petrus", Education.PHD));
//        university.add(new Person("Arto", Education.HS));
//        university.add(new Person("Elina", Education.PHD));
//
//        university.print();
//
//        university.fire(Education.HS);
//
//        System.out.println("==");
//
//        university.print();

//        Hand hand1 = new Hand();
//
//        hand1.add(new Card(2, Suit.DIAMOND));
//        hand1.add(new Card(14, Suit.SPADE));
//        hand1.add(new Card(12, Suit.HEART));
//        hand1.add(new Card(2, Suit.SPADE));
//
//        Hand hand2 = new Hand();
//
//        hand2.add(new Card(11, Suit.DIAMOND));
//        hand2.add(new Card(11, Suit.SPADE));
//        hand2.add(new Card(11, Suit.HEART));
//
//        int comparison = hand1.compareTo(hand2);
//
//        if (comparison < 0) {
//            System.out.println("better hand is");
//            hand2.print();
//        } else if (comparison > 0){
//            System.out.println("better hand is");
//            hand1.print();
//        } else {
//            System.out.println("hands are equal");
//        }

//        Card first = new Card(2, Suit.DIAMOND);
//        Card second = new Card(14, Suit.SPADE);
//        Card third = new Card(12, Suit.HEART);
//
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        Employees university = new Employees();
//        university.add(new Person("Petrus", Education.PHD));
//        university.add(new Person("Arto", Education.HS));
//        university.add(new Person("Elina", Education.PHD));
//
//        university.print();
//
//        university.fire(Education.HS);
//
//        System.out.println("----------------------------------");
//
//        university.print();
//        Person anna = new Person("Anna", Education.PHD);
//        System.out.println(anna);
//        StringBuilder test = new StringBuilder();
//
//        test.append("abc\n");
//        test.append("cbd\t");
//        test.append("def");
//
//        System.out.println(test.toString());

//        Checker check = new Checker();
//
//        System.out.println(check.timeOfDay("17:23:05"));
//        System.out.println(check.timeOfDay("33:33:33"));
    }




}
