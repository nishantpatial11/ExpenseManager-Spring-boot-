package com.example.expensemanager.controller;

import com.example.expensemanager.entities.ExpenseDTO;
import com.example.expensemanager.entities.ExpenseTO;
import com.example.expensemanager.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/person/expenses")
    public List<ExpenseDTO> getExpenses(){
        return expenseService.getAllExpenses();
    }
    @GetMapping("/person/expenses/{id}")
    public Optional<ExpenseDTO> getExpense(@PathVariable("id") int eid){
        return expenseService.getById(eid);
    }
    @PostMapping("person/expenses")
    public ExpenseDTO addExpense(@RequestBody ExpenseTO expenseTO){
        return expenseService.addExpense(expenseTO);
    }
    @PutMapping("/person/expenses/{id}")
    public ExpenseDTO updateExpense(@RequestBody ExpenseTO expenseTO, @PathVariable("id") int eid){
        return expenseService.updateExpense(expenseTO,eid);
    }
    @DeleteMapping("/person/expenses/{id}")
    public String deleteExpense(@PathVariable("id") int eid){
        expenseService.deleteExpense(eid);
        return "Expense of eid : "+eid+ " deleted Successfully!!!";
    }


}
