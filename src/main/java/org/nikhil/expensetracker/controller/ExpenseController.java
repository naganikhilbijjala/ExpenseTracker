package org.nikhil.expensetracker.controller;

import org.nikhil.expensetracker.entity.Expense;
import org.nikhil.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;
    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(){
        return expenseService.getAllExpenses();
    }
}
