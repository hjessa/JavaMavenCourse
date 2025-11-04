package Part7.LargePrograms;

import java.util.ArrayList;

public class ExcerciseManagement {

    private ArrayList<Exercise> exerciseList;


    public ExcerciseManagement(){
        this.exerciseList = new ArrayList<>();
    }

    public ArrayList<String> getExcerciseList(){
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exerciseList) {
            list.add(exercise.getName());
        }

        return list;
    }

    public void add(String input){
        exerciseList.add(new Exercise(input));
    }

    public void markAsCompleted(String exercise){
        for (Exercise exercise1 : exerciseList) {
            if(exercise1.getName().equals(exercise)){
                exercise1.setCompleted(true);
            }
        }
    }
    public boolean isCompleted(String exercise) {
        for (Exercise exercise1 : exerciseList) {
            if(exercise1.getName().equals(exercise)){
                return exercise1.isCompleted();
            }
        }

        return false;
    }
}
