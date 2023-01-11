package com.example.CalculatorApp.operations;

import java.util.List;

public interface Operations {
    public List<Operation> meetCriteria(List<Operation> operation);
    public double x = 0;
    public double y = 0;

    double compute();
}
