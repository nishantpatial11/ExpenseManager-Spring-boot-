package com.example.expensemanager.services;

import com.example.expensemanager.entities.ExpenseDTO;
import com.example.expensemanager.entities.ExpenseTO;
import com.example.expensemanager.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;
    public List<ExpenseDTO> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Optional<ExpenseDTO> getById(int eid) {
        return expenseRepository.findById(eid);
    }

    public ExpenseDTO addExpense(ExpenseTO expenseTO) {
        ExpenseDTO newExpense = new ExpenseDTO(expenseTO);
        return expenseRepository.save(newExpense);

    }

    public ExpenseDTO updateExpense(ExpenseTO expenseTO, int eid) {
        expenseTO.setId(eid);
        ExpenseDTO updatedExpense = new ExpenseDTO(expenseTO);
        return expenseRepository.save(updatedExpense);
    }

    public void deleteExpense(int eid) {
        expenseRepository.deleteById(eid);
    }
}
