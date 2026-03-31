package Part134;

import javafx.application.Application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Give me title");
        String input = new Scanner(System.in).nextLine();


        Application.launch(UserTitle.class, "--title="+input);
    }
}
