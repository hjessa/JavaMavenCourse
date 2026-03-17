package Part123;

import Part9.Packable;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (int number: lotteryNumbers) {
            System.out.print(number + " ");
        }

        System.out.println("");

//        WeatherMan forecaster = new WeatherMan();
//
//        // save days of the week to a list
//        ArrayList<String> days = new ArrayList<>();
//        days.add("Mon");
//        days.add("Tue");
//        days.add("Wed");
//        days.add("Thu");
//        days.add("Fri");
//        days.add("Sat");
//        days.add("Sun");
//
//        System.out.println("Next week's weather forecast:");
//
//        for (String day : days) {
//            String weatherForecast = forecaster.forecast();
//            int temperatureForecast = forecaster.makeAForecast();
//
//            System.out.println(day + ": " + weatherForecast + " " + temperatureForecast + " degrees.");
//        }
//        Die die = new Die(6);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(die.throwDie());
//        }

//        System.out.println("How many random numbers should be printed?");
//        Scanner scanner = new Scanner(System.in);
//        int value = Integer.valueOf(scanner.nextLine());
//        generateRandom(value);
    }

    public static void generateRandom(int num){

        Random randomNum = new Random();

        for(int i = 0; i< num; i++){
            System.out.println(randomNum.nextInt(10));
        }
    }
}
