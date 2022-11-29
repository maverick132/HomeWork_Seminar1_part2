package App;

import Core.Array;
import Core.CalcArr;

public class Main {
    public static void main(String[] args) {
        CalcArr arr = new CalcArr();
        arr.createArr(new int[]{1,2,3,4,0});
        arr.printArr();


        // Исключения из-за неверного индекса массива
        arr.printElement(5);
        arr.printElement(0);

        // Исключение из-за деления на 0
        System.out.println(arr.div(0,4));

        // Исключения из-за некорректного ввода
        CalcArr arrSecond = new CalcArr();
        arrSecond.inputArr();



    }
}