package Part123;

import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random generator = new Random();
        int numToAdd = 0;

        while(this.numbers.size()<6){
            numToAdd = generator.nextInt(40) +1;
            if(!this.containsNumber(numToAdd)){
                this.numbers.add(numToAdd);
            }
        }
    }

    public boolean equals(Object other) {
        return false;
    }
}
