package Part7.LargePrograms;

import java.text.MessageFormat;
import java.util.Scanner;

public class GradeStatUI {

    private Scanner scanner;
    private Grades grades;

    public GradeStatUI(Grades grades){
        this.scanner = new Scanner(System.in);
        this.grades = grades;
    }

    public void run(){
        System.out.println("Enter point totals, -1 stops:");

        while(true){
            int input = Integer.valueOf(this.scanner.nextLine());

            if(input == -1){
                break;
            }

            if(input >0){
                grades.add(input);

                if(input >= 50){
                    grades.addPassing(input);
                }
            }

        }
        String format = MessageFormat.format("Point average (all): {0}", grades.average());
        System.out.println(format);
        String format2 = MessageFormat.format("Point average (passing): {0}", grades.averagePass());
        System.out.println(format2);
        String format3 = MessageFormat.format("Pass percentage:  {0}", grades.passPercentage());
        System.out.println(format3);
        grades.printGrades();

    }

}
