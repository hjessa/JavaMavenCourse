package Part8;

import java.util.ArrayList;
import java.util.Scanner;

public class Recap {

    public static void main(String[] args){

        positiveAvg();
    }

    public static void cube(){
        Scanner scanner = new Scanner(System.in);

        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }

            int num = Integer.valueOf(input);
            System.out.println(num*num*num);
        }
    }

    public static void positiveAvg(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num==0){
                break;
            }

            if(num>0){
                sum+=num;
                counter++;
            }

        }

        if(sum != 0){
            System.out.println((double) sum/counter);
        }
        else {
            System.out.println("Cannot calculate the average");
        }
    }
}
