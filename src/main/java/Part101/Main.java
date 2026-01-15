package Part101;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        ArrayList<String> inputs = new ArrayList<>();
        ArrayList<Integer> inputs2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//        printUserInput(scanner,inputs);

        limitedNumbers(scanner,inputs2);
//        avgStream(scanner,inputs);
//        avgStreamPosNeg(scanner,inputs);

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(-2);
//        numbers.add(4);
//        numbers.add(-4);
//
//        System.out.println(positive(numbers));

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(3);
//        numbers.add(2);
//        numbers.add(-17);
//        numbers.add(-5);
//        numbers.add(7);
//
//        ArrayList<Integer> divisible = divisible(numbers);
//
//        divisible.stream()
//                .forEach(num -> System.out.println(num));

    }

    static void avgStream(Scanner scanner, ArrayList<String> inputs){

        System.out.println("Input numbers, type end to stop.");
        while (true){
            String row = scanner.nextLine();
            if(row.equals("end")){
                break;
            }
            inputs.add(row);
        }

        double avg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Average is: "+avg);
    }

    static void avgStreamPosNeg(Scanner scanner, ArrayList<String> inputs){

        String input = "";
        System.out.println("Input numbers, type end to stop.");
        while(true){
            input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            inputs.add(input);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        input = scanner.nextLine();

        if(input.equals("p")){
            double avg = inputs.stream()
                    .mapToInt(s->Integer.valueOf(s))
                    .filter(num -> num > 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the positive numbers: "+avg);

        }else if(input.equals("n")){
            double avgNegative = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(num -> num < 0)
                    .average()
                    .getAsDouble();

            System.out.println("Average of the negative numbers: "+avgNegative);
        }
        else{
            System.out.println("Wrong choice");
        }

    }

    public static List<Integer> positive(List<Integer> numbers){

        return numbers.stream()
                .filter(num -> num>0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers){

        return numbers.stream()
                .filter(num -> num%5==0 || num%3==0 || num%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void printUserInput(Scanner scanner, ArrayList<String> inputs){

        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            inputs.add(input);

        }

        String result = inputs.stream()
                .reduce("",(previousString,word)->(previousString + word + "\n"));
        System.out.println(result);
    }

    public static void limitedNumbers(Scanner scanner, ArrayList<Integer> inputs){

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input < 0){
                break;
            }
            inputs.add(input);

        }
        inputs.stream()
                        .filter(num -> num >= 1 && num <= 5)
                        .forEach(num -> System.out.println(num));
    }


}
