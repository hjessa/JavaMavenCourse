package Part122;

public class Program {

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){

        int arraySize = array.length;

        if(toWhere > arraySize){
            toWhere = arraySize;
        }

        if(fromWhere < 0){
            fromWhere = 0;
        }

        int sum = 0;
        for (int i = fromWhere; i < toWhere; i++){
            if(array[i]>=smallest && array[i]<=largest){
                sum = sum+array[i];
            }
        }
        return sum;
    }


}
