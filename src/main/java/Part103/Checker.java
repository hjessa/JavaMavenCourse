package Part103;

public class Checker {

    public boolean isDayOfWeek(String string){
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    public boolean allVowels(String string){
        return string.matches("[aeiou]+");
    }

    public boolean timeOfDay(String string){
        return string.matches("[00:00:00]-[23:59:59]");
    }

}
