//import java.sql.TimeStamp;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
	Map<String , Integer> data = new HashMap<String , Integer>();	
	Integer val1 = Integer.valueOf(4);
	data.put("Dal" , val1);
	val1 = Integer.valueOf(5);
	data.put("Rice" , val1);
	val1 = Integer.valueOf(1);
	data.put("Chapati" , val1);
	val1 = Integer.valueOf(3);
	data.put("Shikanji" , val1);

	DailyWastage dailywastage = new DailyWastage(LocalDate.now() , data);
	dailywastage.print();
	System.out.println();

	WeeklyExpense weeklyexpense = new WeeklyExpense(LocalDate.now() , data);
	weeklyexpense.print();
	System.out.println();
	
	Map<String , Integer> data1 = new HashMap<String , Integer>();
	val1 = Integer.valueOf(4);
	data1.put("Table" , val1);
	val1 = Integer.valueOf(5);
	data1.put("Chair" , val1);
	val1 = Integer.valueOf(1);
	data1.put("Light" , val1);
	val1 = Integer.valueOf(3);
	data1.put("Fan" , val1);
	FixedExpense fixedexpense = new FixedExpense(data1);
	fixedexpense.print();
	
    }
}

