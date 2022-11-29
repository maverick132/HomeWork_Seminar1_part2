package Test;

import Core.CalcArr;

public class TeskOK {
    public TeskOK() { //Проверка работы методов
        CalcArr arrFirst = new CalcArr(10);
        CalcArr arrSecond = new CalcArr(10);
        arrFirst.createRandomArr();
        arrFirst.printArr();
        arrSecond.createRandomArr();
        arrSecond.printArr();
        System.out.println("----------------------------");

        System.out.println("Sum");
        CalcArr resultSum = arrFirst.sum(arrSecond);
        resultSum.printArr();

        System.out.println("Sub");
        CalcArr resultSub = arrFirst.sub(arrSecond);
        resultSub.printArr();

        System.out.println("Div");
        CalcArr resultDiv = arrFirst.div(arrSecond);
        resultDiv.printArr();

        System.out.println("Mult");
        CalcArr resultMult = arrFirst.mult(arrSecond);
        resultMult.printArr();
    }
}

