package org.example;

public class Calculator {

    private int operationCount;

    public int getOperationCount() {
        return operationCount;
    }

    public int minus(int int1, int int2){

        int resultMinus = int1-int2;
        operationCount++;
        return resultMinus;


    }

    public int plus (int int1, int int2) {
        int resultPlus = int1+int2;
        operationCount++;
        return resultPlus;
    }
}
