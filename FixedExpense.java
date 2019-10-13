import java.util.*;
import java.lang.*;
import java.io.*;

public class FixedExpense {
    private Map<String, Integer> expenses;

    public FixedExpense(Map<String, Integer> expenses) {
        this.expenses = expenses;
    }

    public void addExpense(String title, int value) {
        Integer temp = Integer.valueOf(value);
        expenses.put(title, temp);
    }

    public Map<String, Integer> getAllExpenses() {
        return expenses;
    }

    public void print() {
        System.out.println("The Fixed Expenses Are :- ");
        System.out.println("Title		Expense(in Rs.)");
        Set set = expenses.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println("  " + entry.getKey() + "		    " + entry.getValue());
        }
    }
}
