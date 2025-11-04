package Part7.LargePrograms;

public class LiquidContainer {

    public static void main(String[] args) {


        LiquidContainerUI ui = new LiquidContainerUI();
        ui.start();
//        Container container = new Container();
//        System.out.println(container);
//
//        container.add(50);
//        System.out.println(container);
//        System.out.println(container.contains());
//
//        container.remove(60);
//        System.out.println(container);
//
//        container.add(200);
//        System.out.println(container);

//        int first = 0;
//        int second = 0;
//        Scanner scanner = new Scanner(System.in);
//
//
//        while(true){
//            System.out.println("First: "+first+"/100");
//            System.out.println("Second: "+second+"/100");
//            String input = scanner.nextLine();
//            String[] parts = input.split(" ");
//            String command = parts[0];
//            int amount = Integer.valueOf(parts[1]);
//
//            if(input.equals("quit")){
//                break;
//            }
//
//            if(command.equals("add")){
//                if(first+amount > 100){
//                    first = 100;
//                }
//                else {
//                    first += amount;
//                }
//            }
//
//            if(command.equals("move")){
//                if(amount>=first) {
//
//                    if (amount + second >= 100) {
//                        second = 100;
//                        first = 0;
//                    } else {
//                        second += amount;
//                        first = 0;
//                    }
//                }
//                else{
//                    if(amount+second>=100){
//                        second = 100;
//                        first -=amount;
//                    }
//
//                }
//
//            }
//            if(command.equals("remove")){
//                if(second-amount<0){
//                    second =0;
//                }
//                else {
//                    second -= amount;
//                }
//            }
//        }
//
    }

}
