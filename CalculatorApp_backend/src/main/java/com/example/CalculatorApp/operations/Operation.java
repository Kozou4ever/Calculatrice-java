package com.example.CalculatorApp.operations;

public class Operation {
    public double first;
    public double second;
    public String operationType;

    public Operation(double first, double second, String operationType) {
        this.first = first;
        this.second = second;
        this.operationType = operationType;
    }

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String type) {
        this.operationType = type;
    }

    public double compute() {
        Operations operation = new OperationSum(0, 0);
        switch (this.getOperationType()) {
            case "+":
                operation = new OperationSum(this.first, this.second);
                break;
            case "-":
                operation = new OperationSubstract(this.first, this.second);
                break;
            case "x":
                operation = new OperationMultiplicate(this.first, this.second);
                break;
            case "÷":
                operation = new OperationDivide(this.first, this.second);
                break;
            case "carre":
                operation = new OperationSquareUp(this.first, this.second);
                break;
        }
        return operation.compute();
    }
}
