package Part101;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

//        avgStream(scanner,inputs);
        avgStreamPosNeg(scanner,inputs);
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
}
