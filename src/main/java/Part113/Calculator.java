package Part113;

public class Calculator {

    public static int factorial(int number) {

        if(number<0){
            throw new IllegalArgumentException("Liczba nie może być mniejsza od 0");
        }
        int result =1;

        if(number == 0){
            return result;
        }

        for (int i = 1; i<=number;i++){
            result = i*result;
        }
        return result;

    }

    public static int binomialCoefficient(int n, int k){
        if(n<0 || k<0){
            throw new IllegalArgumentException("Liczba nie może być mniejsza od 0");
        }
        if(k>n){
            throw new IllegalArgumentException("Podzbiór k nie może być mniejszy od zbioru n");
        }
        return factorial(n)/(factorial(k)*(factorial(n-k)));
    }

}
