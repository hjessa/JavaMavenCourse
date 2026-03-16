package Part122;


public class Main {

    public static void main(String[] args){

        List<String> myList = new List<>();
        myList.add("hello");
        myList.add("world");

        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }

//        int[] numbers = {3, -1, 8, 4};
//
//        System.out.println(numbers.length);
//        System.out.println(Program.sum(numbers, 0, 0, 0, 0));
//        System.out.println(Program.sum(numbers, 0, 0, 0, 10));
//        System.out.println(Program.sum(numbers, 0, 1, 0, 10));
//        System.out.println(Program.sum(numbers, 0, 1, -10, 10));
//        System.out.println(Program.sum(numbers, -1, 999, -10, 10));
    }
}
