package Part7.LargePrograms;

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
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by name");
        System.out.println("find ingredient");

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

            if(command.equals("find name")){
                System.out.println("Searched word");
                String searchedWord = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    recipe.findName(searchedWord);
                }

            }
            if(command.equals("find cooking time")){
                System.out.println("Max cooking time");
                int searchedTime = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe : recipes) {
                    recipe.findTime(searchedTime);
                }
            }

            if(command.equals("find ingredient")){
                System.out.println("Ingredient");
                String searchedWord = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    recipe.findIngredient(searchedWord);
                }

            }

        }
    }
}
