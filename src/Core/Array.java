package Core;

import View.InputArr;
import View.OutputArr;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Array implements InputArr, OutputArr {
    int[] arr;

    @Override
    public void inputArr() {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()){
            System.out.println("Ошибка! Введите размерность массива. Число должно быть целочисленное положительное");
        }
        arr = new int[scanner.nextInt()];

        System.out.println("Сгенерировать массив автоматически? Д или Н?");
        while (!scanner.hasNext("Д") && !scanner.hasNext("Н")){
            System.out.println("Некорректный ввод. Введите Д если хотите автоматически сгенерировать массив и Н если нет");
        }
        if (scanner.next().equals("Д")) {
            for (int i = 0; i < arr.length; i++) {
                Random random = new Random();
                arr[i] = random.nextInt(100);
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Введите следующее число массива:");
                arr[i] = scanner.nextInt();
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
