package Part9;

import java.text.MessageFormat;

public class Person {

    protected String displayName;
    protected String address;

    public Person(String displayName, String address){
        this.displayName = displayName;
        this.address = address;
    }

    public String toString() {
        return MessageFormat.format("{0} \n   {1}",this.displayName,this.address);

    }

    public static void main(String[] args){
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
    }
}
