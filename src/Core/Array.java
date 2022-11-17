package Core;

import View.InputArr;
import View.OutputArr;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Array implements InputArr, OutputArr {
    int[] arr;

    @Override
    public void inputArr() {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) arr = new int[scanner.nextInt()];
        else  throw new InputMismatchException("Ошибка! Размерность массива должна быть целочисленной");

        System.out.println("Сгенерировать массив автоматически? Д или Н?");
        if (!scanner.hasNext("Д") && !scanner.hasNext("Н")) throw new InputMismatchException("Ошибка! Введен не корректный ответ");
        else {

            if (scanner.next().equals("Д")) {
                for (int i = 0; i < arr.length; i++) {
                    Random random = new Random();
                    arr[i] = random.nextInt(100);
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Введите следующее число массива:");
                    arr[i] = scanner.nextInt();
                }
            }
        }
        System.out.println("Заданный массив:");
        this.printArr();
    }

    @Override
    public void printArr() {
        for (Integer x: this.arr) {
            System.out.printf("%d ", x);
        }
    }
}
