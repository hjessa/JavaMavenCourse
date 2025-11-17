package Part8;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public static void main(String[] args){
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        SimpleDate newObj = (SimpleDate) obj;
        return newObj.day == this.day && newObj.month == this.month && newObj.year == this.year;
    }

    @Override
    public int hashCode() {
        int hash = 17;          // startowa liczba
        hash = 31 * hash + year;   // rok daje największy „wpływ”
        hash = 31 * hash + month;  // miesiąc zmienia hash
        hash = 31 * hash + day;    // dzień zmienia hash
        return hash;
    }
}
