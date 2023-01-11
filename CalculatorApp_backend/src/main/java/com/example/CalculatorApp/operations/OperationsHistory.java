package com.example.CalculatorApp.operations;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table; 

@Entity
@Table
public class OperationsHistory {
    @Id
    @SequenceGenerator(
        name = "history_sequence",
        sequenceName = "history_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "history_sequence"
    )
    private Long id;
    private LocalDate date;
    private double first;
    private double second;
    private String operation;
    private double result;

    public OperationsHistory() {}

    public OperationsHistory(Long id, LocalDate date, double first, double second, String operation, double result) {
        this.id = id;
        this.date = date;
        this.first = first;
        this.second = second;
        this.operation = operation;
        this.result = result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getOperation() {
        return operation;
    }

    public double getResult() {
        return result;
    }
}
