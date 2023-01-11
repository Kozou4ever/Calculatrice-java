package com.example.CalculatorApp.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/operations")
@CrossOrigin("http://localhost:5173")
public class OperationsController {

    private final OperationService operationService;

    @Autowired
    public OperationsController(OperationService operationService) {
        this.operationService = operationService;
    }

    @PostMapping("/calcule")
    @ResponseBody
    public double calcul(@RequestBody OperationRequest request) {
        Operation operation = new Operation(request.getFirst(), request.getSecond(), request.getOperationType());
        // create criteria design pattern to know to which operqtion it should go
        operationService.setOperations(operation);
        return operation.compute();
    }

    @GetMapping("/history")
    public List<OperationsHistory> getOperations() {
        return operationService.getOperations();
    }

    @GetMapping("/additions")
    public List<OperationsHistory> getAdditions() {
        return operationService.getAdditions();
    }

    @GetMapping("/soustractions")
    public List<OperationsHistory> getSoustractions() {
        return operationService.getSoustractions();
    }

    @GetMapping("/multiplications")
    public List<OperationsHistory> getMultiplications() {
        return operationService.getMultiplications();
    }

    @GetMapping("/divisions")
    public List<OperationsHistory> getDivisions() {
        return operationService.getDivisions();
    }

    @GetMapping("/carres")
    public List<OperationsHistory> getCarre() {
        return operationService.getCarre();
    }
}
