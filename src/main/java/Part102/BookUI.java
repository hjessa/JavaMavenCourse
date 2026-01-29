package Part102;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BookUI {

    public Scanner scanner;

    public BookUI(Scanner scanner){
        this.scanner = scanner;
    }

    public void run(){

        ArrayList<Book> books = new ArrayList<>();
        String input = "";
        int ageRec = 0;
        String name = "";

        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            name = input;
            System.out.print("Input the age recommendation ");
            input = scanner.nextLine();
            ageRec = Integer.valueOf(input);

            books.add(new Book(name,ageRec));
        }

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeReccomendation)
                .thenComparing(Book::getName);

        books.sort(comparator);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
