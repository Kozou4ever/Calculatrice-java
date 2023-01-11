package com.example.CalculatorApp.operations;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<OperationsHistory, Long> {
    @Query(value = "select * from operations_history o where o.operation = :type", nativeQuery = true)
    List<OperationsHistory> findSpecificOperations(@Param("type") String operation);
}
