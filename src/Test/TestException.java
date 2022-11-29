package Test;

import Core.CalcArr;

public class TestException {
    CalcArr arrFirst, arrSecond;



    public void createTestArr(int firstSize, int secondSize) {
        arrFirst = new CalcArr(firstSize);
        arrFirst.createRandomArr();
        arrFirst.printArr();

        arrSecond = new CalcArr(secondSize);
        arrSecond.createRandomArr();
        arrSecond.printArr();
        System.out.println("----------------------------");

    }
    public void testSumExcept(int firstSize, int secondSize){
        createTestArr(firstSize,secondSize);
        System.out.println("Sum");
        CalcArr resultSum = arrFirst.sum(arrSecond);
        resultSum.printArr();
    }
    public void testSubExcept(int firstSize, int secondSize){
        createTestArr(firstSize,secondSize);
        System.out.println("Sub");
        CalcArr resultSub = arrFirst.sub(arrSecond);
        resultSub.printArr();
    }
    public void testDivExcept(int firstSize, int secondSize){
        createTestArr(firstSize,secondSize);
        System.out.println("Div");
        CalcArr resultDiv = arrFirst.div(arrSecond);
        resultDiv.printArr();
    }
    public void testMultExcept(int firstSize, int secondSize){
        createTestArr(firstSize,secondSize);
        System.out.println("Mult");
        CalcArr resultMult = arrFirst.mult(arrSecond);
        resultMult.printArr();
    }
}
