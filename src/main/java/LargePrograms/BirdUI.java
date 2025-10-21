package LargePrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdUI {

    private Scanner scanner;
    private ArrayList<Bird> birds;

    public BirdUI(Scanner scanner, ArrayList<Bird> birds){
        this.scanner = scanner;
        this.birds = birds;
    }

    public void run(){

        String name = "";
        String latinName = "";
        while(true){
            System.out.print("? ");
            String input = this.scanner.nextLine();

            if(input.equals("Quit")){
                break;
            }

            if(input.equals("Add")){
                System.out.print("Name: ");
                name = this.scanner.nextLine();
                System.out.print("Name in Latin: ");
                latinName = this.scanner.nextLine();
                this.birds.add(new Bird(name,latinName));
            }

            if(input.equals("Observation")){
                System.out.print("Bird? ");
                name = this.scanner.nextLine();
                boolean exist = false;
                for (Bird bird : birds) {
                    if(bird.findName(name)){
                        bird.setObservations();
                        exist = true;
                    }
                }
                if(!exist){
                    System.out.println("Not a bird!");
                }

            }

            if(input.equals("All")){
                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }

            if(input.equals("One")){
                System.out.print("Bird? ");
                name = this.scanner.nextLine();
                for (Bird bird : birds) {
                    if(bird.findName(name)){
                        System.out.println(bird);
                    }
                }
            }
        }

    }
}
