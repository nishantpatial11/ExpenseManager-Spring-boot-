package com.example.expensemanager.repository;

import com.example.expensemanager.entities.ExpenseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<ExpenseDTO, Integer> {
    public ExpenseDTO getById(int eid);
}
