import java.sql.Timestamp;
import java.util.*;
import java.time.*;
import java.lang.*;
import java.io.*;

public class WeeklyExpense
{
    private LocalDate startOfWeek;
    private Map <String , Integer> expenses;

    public WeeklyExpense(LocalDate startOfWeek , Map <String , Integer> expenses)
    {
	this.startOfWeek = startOfWeek;
	this.expenses = expenses;
    }
    
    public void addExpense(String title , int value)
    {
	Integer temp = Integer.valueOf(value);
	expenses.put(title , temp);
    }

    public Map <String , Integer> getAllExpenses()
    {
	return expenses;
    }

    public void print()
    {
	System.out.println("The Week Starts From The Date : " + startOfWeek.toString());
	System.out.println("The Weekly Expenses Are :- ");
	System.out.println("Title		Expense");
	Set set = expenses.entrySet();
	Iterator itr = set.iterator();
	while(itr.hasNext())
	{
	    Map.Entry entry = (Map.Entry)itr.next();
	    System.out.println("  " + entry.getKey() + "		    " + entry.getValue());
	}
    }
}

