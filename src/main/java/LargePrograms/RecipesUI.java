package LargePrograms;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipesUI {

    private Scanner scanner;

    public RecipesUI(){
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println("File to read:");
        String input = this.scanner.nextLine();

        ArrayList<String> przepis = new ArrayList<>();
        ArrayList<ArrayList<String>> przepisy = new ArrayList<>();
        ArrayList<Recipe> recipes = new ArrayList<>();
        String row = "";
        System.out.println(input);

        try (Scanner fileRead = new Scanner(Paths.get("src/main/java/LargePrograms/"+input))){
            while (fileRead.hasNextLine()) {
                row = fileRead.nextLine();
                przepis.add(row);
            if (row.isEmpty() || !fileRead.hasNextLine()) {
                przepisy.add(przepis);
                przepis = new ArrayList<>();
              }
            }

            for (ArrayList<String> strings : przepisy) {
                String name = strings.getFirst();
                int time = Integer.valueOf(strings.get(1));
                ArrayList<String> ingredients = new ArrayList<>(strings.subList(2, strings.size()));
                Recipe recipe = new Recipe(name,time,ingredients);
                recipes.add(recipe);
            }
            //petla listy lisy, ktora utworzy obiekty na podstawie indeksów

        } catch (Exception e) {
            System.out.println("Błąd odczytu pliku");
            }

        //komendy, logika

        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");

        while(true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            if(command.equals("stop")){
                break;
            }

            if(command.equals("list")){
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            }
        }
    }
}
