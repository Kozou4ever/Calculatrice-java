package com.example.CalculatorApp.operations;

import java.util.ArrayList;
import java.util.List;

public class OperationMultiplicate implements Operations {
    private double x;
    private double y;

    public OperationMultiplicate(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double compute(){
        return x * y;
    }

    @Override
    public List<Operation> meetCriteria(List<Operation> operations) {
        List<Operation> multiplication = new ArrayList<Operation>(); 
      
        for (Operation operation : operations) {
            if(operation.getOperationType().equalsIgnoreCase("MULTIPLICATION")){
                multiplication.add(operation);
            }
        }
        return multiplication;
    }
}
