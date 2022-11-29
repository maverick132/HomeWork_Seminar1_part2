package Core;

import View.InputArr;
import View.OutputArr;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Array implements InputArr, OutputArr {
    int[] arr;

    private void createRandomArr(){
        for (int i = 0; i < this.arr.length; i++) {
            Random random = new Random();
            this.arr[i] = random.nextInt(100);
        }
    }

    private void enterArr(Scanner scanner){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите следующее число массива:");
            if (scanner.hasNextInt()) this.arr[i] = scanner.nextInt();
            else throw new InputMismatchException("Было введено не целое число");
        }
    }


    public void printElement(int index) {
        if (index > this.arr.length - 1 || index <= 0) throw new ArrayIndexOutOfBoundsException("Индекс выходит за пределы массива");
        else System.out.printf("Элемент номер %d в массиве равен %d \n", index, this.arr[index]);
    }

    public void createArr(int size) {
        this.arr = new int[size];
        createRandomArr();
    }
    public void createArr(int[] tempArr) {
        this.arr = new int[tempArr.length];
        for (int i = 0; i < tempArr.length; i++) {
            this.arr[i] = tempArr[i];
        }
    }
    @Override
    public void inputArr() {
        System.out.println("Введите размерность массива");
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int temp = scanner.nextInt();
            if (temp > 0) this.arr = new int[temp];
            else throw new NegativeArraySizeException("Размерность массива должна быть положительной");
        }
        else  throw new InputMismatchException("Размерность массива должна быть целым числом");

        System.out.println("Сгенерировать массив автоматически? Д или Н?");

        if (!scanner.hasNext("Д") && !scanner.hasNext("Н")) throw new InputMismatchException("Введен не корректный ответ");
        else {
            if (scanner.next().equals("Д"))  createRandomArr();
            else enterArr(scanner);
        }
        System.out.println("Заданный массив:");
        this.printArr();
    }

    @Override
    public void printArr() {
        for (Integer x: this.arr) {
            System.out.printf("%d ", x);
        }
        System.out.println();
    }

}
