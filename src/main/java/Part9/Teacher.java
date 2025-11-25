package Part9;

import java.text.MessageFormat;

public class Teacher extends Person{

    protected int salary;

    public Teacher(String displayName, String address, int salary){
        super(displayName,address);
        this.salary = salary;
    }

    public String toString(){
        return MessageFormat.format("{0} \n     salary {1} euro/month",super.toString(),this.salary);
    }

    public static void main(String[] args){
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            ollie.study();
            i = i + 1;
        }
        System.out.println(ollie);
    }
}
