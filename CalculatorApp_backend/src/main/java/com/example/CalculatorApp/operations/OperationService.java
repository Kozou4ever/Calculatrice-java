package com.example.CalculatorApp.operations;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationService {

    private final OperationRepository operationRepository;

    @Autowired
    public OperationService(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    public List<OperationsHistory> getOperations() {
        return operationRepository.findAll();
    }

    public List<OperationsHistory> getAdditions() {
        return operationRepository.findSpecificOperations("+");
    }

    public List<OperationsHistory> getSoustractions() {
        return operationRepository.findSpecificOperations("-");
    }

    public List<OperationsHistory> getMultiplications() {
        return operationRepository.findSpecificOperations("x");
    }

    public List<OperationsHistory> getDivisions() {
        return operationRepository.findSpecificOperations("÷");
    }

    public List<OperationsHistory> getCarre() {
        return operationRepository.findSpecificOperations("carre");
    }

    public void setOperations(Operation operation) {
        double first = operation.getFirst();
        double second = operation.getSecond();
        String type = operation.getOperationType();
        OperationsHistory history = new OperationsHistory(null, LocalDate.now(), first, second, type,
                operation.compute());
        operationRepository.save(history);
    }
}
