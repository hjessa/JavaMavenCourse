package Part101;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        ArrayList<String> inputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

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
}
