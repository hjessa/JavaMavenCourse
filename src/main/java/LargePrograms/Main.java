package LargePrograms;


public class Main {

    public static void main(String[] args){
        Grades grades = new Grades();
        GradeStatUI ui = new GradeStatUI(grades);
        ui.run();
    }
}
