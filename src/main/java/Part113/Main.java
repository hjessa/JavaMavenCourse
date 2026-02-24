package Part113;

public class Main {

    public static void main(String[] args){

//        Person p = new Person("",12);

//        System.out.println(Calculator.factorial(4));
//        System.out.println(Calculator.binomialCoefficient(5,2));
        Statistics st = new Statistics();
        st.add(2);
        System.out.println("Printing the average of the statistics: " + st.average());
        System.out.println("Adding number 22");
        st.add(22);
        System.out.println("Printing the average of the statistics: " + st.average());
    }
}
