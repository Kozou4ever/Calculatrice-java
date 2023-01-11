package com.example.CalculatorApp.operations;

import java.util.ArrayList;
import java.util.List;

public class OperationSquareUp implements Operations {
    private double x;
    private double y;

    public OperationSquareUp(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double compute(){
        return Math.pow(x, y);
    }

    @Override
    public List<Operation> meetCriteria(List<Operation> operations) {
        List<Operation> carre = new ArrayList<Operation>(); 
      
        for (Operation operation : operations) {
            if(operation.getOperationType().equalsIgnoreCase("CARRE")){
                carre.add(operation);
            }
        }
        return carre;
    }
}
