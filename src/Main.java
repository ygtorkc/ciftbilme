import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value){
                return false;
            }


        }
        return false;
    }


    public static void main(String[] args) {
        int [] list = {2,4,6,2,2,8,10,12,10,10,10,18,20,22,22,24,32,28};
        int [] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i=0 ; i< list.length; i++){

            for(int j = 0 ; j < list.length ; j++){
                 if ((i != j) && (list[i]==list[j])){
                  duplicate[startIndex++] = list [i];
                   break;

                 }

            }


        }





    for(int value : duplicate){
        if ( value != 0){
            System.out.println(value);
        }
    }



    }
}