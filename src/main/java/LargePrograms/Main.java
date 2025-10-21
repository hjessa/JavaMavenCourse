package LargePrograms;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
//        Grades grades = new Grades();
//        GradeStatUI ui = new GradeStatUI(grades);
//        ui.run();

//        RecipesUI ui = new RecipesUI();
//        ui.run();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        BirdUI ui = new BirdUI(scanner,birds);
        ui.run();
    }
}
