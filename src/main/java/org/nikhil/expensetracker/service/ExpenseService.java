package org.nikhil.expensetracker.service;

import org.nikhil.expensetracker.entity.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getAllExpenses();
}
