package Part102;

public class Human implements Comparable<Human>{

    private String name;
    private int wage;

    public Human(String name, int wage){
        this.name = name;
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public int compareTo(Human human){
        return this.wage - human.getWage();
    }
}
