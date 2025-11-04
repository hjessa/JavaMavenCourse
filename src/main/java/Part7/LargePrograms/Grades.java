package Part7.LargePrograms;

import java.util.ArrayList;

public class Grades {

    public ArrayList<Integer> grades;
    public ArrayList<Integer> passGrades;

    public Grades(){
        this.grades = new ArrayList<>();
        this.passGrades = new ArrayList<>();
    }

    public void add(int input){
        this.grades.add(input);
    }

    public void addPassing(int input){
        this.passGrades.add(input);
    }

    public double average(){
        int counter = this.grades.size();
        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return (double) sum/counter;
    }

    public double averagePass(){
        int counter = this.passGrades.size();
        int sum = 0;
        for (Integer grade : passGrades) {
            sum += grade;
        }
        return (double) sum/counter;
    }

    public double passPercentage(){
        return (double) (100 * this.passGrades.size()) /this.grades.size();
    }

    public static int gradeNumber(int input){

        if(input >0 && input <=100){
            if(input < 50){
                return 0;
            }

            if(input<60){
                return 1;
            }

            if(input<70){
                return 2;
            }

            if(input<80){
                return 3;
            }

            if(input<90){
                return 4;
            }
            return 5;
        }
        else return -1;

    }

    public void printGrades(){
        for (int i = 0; i < 6; i++) {
            System.out.print(i+": ");
            for (Integer grade : grades) {
                if(gradeNumber(grade) == i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
