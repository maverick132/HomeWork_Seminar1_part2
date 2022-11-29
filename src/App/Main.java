package App;

import Core.Array;
import Core.CalcArr;

public class Main {
    public static void main(String[] args) {
//        CalcArr arr = new CalcArr();
//        arr.inputArr();
        int[] ar1;
        ar1 = new int[]{1,2,3};
        printArr(ar1);

        ar1 = new int[]{2,3,4,5};

        printArr(ar1);


    }

    public static void printArr(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}