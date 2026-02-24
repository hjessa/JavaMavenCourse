package Part113;

import java.util.ArrayList;
import java.util.List;
public class Statistics {
    private List<Integer> numbers;
    public void add(int number) {
        this.numbers.add(number);
    }
    public Statistics(){
        this.numbers = new ArrayList<>();
    }
    public double average() {
        return this.numbers.stream().mapToInt(i -> i).average().getAsDouble();
    }
}
