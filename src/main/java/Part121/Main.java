package Part121;

public class Main {

    public static void main(String[] args){


        Pipe<Integer> numberPipe = new Pipe<>();
        numberPipe.putIntoPipe(1);
        numberPipe.putIntoPipe(2);
        numberPipe.putIntoPipe(3);

        int sum = 0;
        while(numberPipe.isInPipe()) {
            sum = sum + numberPipe.takeFromPipe();
        }
        System.out.println(sum);
        System.out.println(numberPipe.takeFromPipe());
//        Hideout<Integer> den = new Hideout<>();
//        System.out.println(den.isInHideout());
//        den.putIntoHideout(1);
//        System.out.println(den.isInHideout());
//        System.out.println(den.isInHideout());
//        System.out.println(den.takeFromHideout());
//        System.out.println(den.isInHideout());
    }
}
