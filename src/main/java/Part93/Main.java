package Part93;

public class Main {

    public static void main(String[] args){

        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
//        Herd herd = new Herd();
//        herd.addToHerd(new Organism(57, 66));
//        herd.addToHerd(new Organism(73, 56));
//        herd.addToHerd(new Organism(46, 52));
//        herd.addToHerd(new Organism(19, 107));
//        System.out.println(herd);
//
//        herd.move(-1,-1);
//        System.out.println(herd);
    }
}
