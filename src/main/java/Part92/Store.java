package Part92;

import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse,Scanner scanner){

        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    public void shop(String customer){
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Witaj w sklepie "+customer);
        System.out.println("wybierz produkt");
        System.out.println();

        for (String key : this.warehouse.products()) {
            System.out.println(key);
        }

        while(true){
            System.out.println("Wprowadź nazwę produktu, który chcesz dodać");
            System.out.println();
            String input = this.scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            if (!warehouse.products().contains(input)) {
                System.out.println("Nie ma takiego produktu");
                continue;
            }

            if(this.warehouse.stock(input)>0){
                this.warehouse.take(input);
                cart.add(input,this.warehouse.price(input));
            }

        }

        System.out.println("Shopping cart content");
        cart.print();
        System.out.println("total: "+cart.price());

    }


}
