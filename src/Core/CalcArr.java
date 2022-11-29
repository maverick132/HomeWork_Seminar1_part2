package Core;

import Core.Interface.EvalutionArr;

public class CalcArr extends Array implements EvalutionArr {
    public CalcArr() {
        this(0);
    }

    public CalcArr(int size) {
        super(size);
    }

    @Override
    public CalcArr div(CalcArr secondArr) {
        if (this.arr.length != secondArr.arr.length) throw new RuntimeException(
                String.format("Длинны массивов не равны. Длина первого массива равна %d, а второго %d",
                        this.arr.length, secondArr.arr.length)
        );
        else {
            CalcArr result = new CalcArr(this.arr.length);
            for (int i = 0; i < this.arr.length; i++) {
                if (secondArr.arr[i] == 0)
                    throw new RuntimeException(
                            String.format("Элемент номер %d во втором массиве равен 0. Деление на 0 запрещено.", i)
                    );
                else result.arr[i] = this.arr[i] / secondArr.arr[i];
            }
            return result;
        }
    }


    @Override
    public CalcArr mult(CalcArr secondArr) {
        if (this.arr.length != secondArr.arr.length) throw new RuntimeException(
                String.format("Длинны массивов не равны. Длина первого массива равна %d, а второго %d",
                        this.arr.length, secondArr.arr.length)
        );
        else {
            CalcArr result = new CalcArr(this.arr.length);
            for (int i = 0; i < this.arr.length; i++) {
                if (this.arr[i] != 0 && secondArr.arr[i] > Integer.MAX_VALUE / this.arr[i]) throw new RuntimeException(
                        String.format("Результат перемножения элементов номер %d выходит за пределы Integer", i)
                );
                else result.arr[i] = this.arr[i] * secondArr.arr[i];
            }
            return result;
        }
    }

    @Override
    public CalcArr sub(CalcArr secondArr) {
        if (this.arr.length != secondArr.arr.length) throw new RuntimeException(
                String.format("Длинны массивов не равны. Длина первого массива равна %d, а второго %d",
                        this.arr.length, secondArr.arr.length)
        );
        else {
            CalcArr result = new CalcArr(this.arr.length);
            for (int i = 0; i < this.arr.length; i++) {
                    result.arr[i] = this.arr[i] - secondArr.arr[i];
            }
            return result;
        }
    }

    @Override
    public CalcArr sum(CalcArr secondArr) {
        if (this.arr.length != secondArr.arr.length) throw new RuntimeException(
                String.format("Длинны массивов не равны. Длина первого массива равна %d, а второго %d",
                        this.arr.length, secondArr.arr.length)
        );
        else {
            CalcArr result = new CalcArr(this.arr.length);
            for (int i = 0; i < this.arr.length; i++) {
                    result.arr[i] = this.arr[i] + secondArr.arr[i];
            }
            return result;
        }
    }
}
