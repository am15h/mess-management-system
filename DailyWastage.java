import java.sql.Timestamp;
import java.util.*;
import java.time.*;
import java.lang.*;
import java.io.*;

public class DailyWastage
{
    private LocalDate date;
    private Map <String , Integer> wastage;

    public DailyWastage(LocalDate date , Map <String , Integer> wastage)
    {
	this.date = date;
	this.wastage = wastage;
    }
    
    public void addWastage(String title , int weight)
    {
	Integer temp = Integer.valueOf(weight);
	wastage.put(title , temp);
    }

    public Map <String , Integer> getAllWastages()
    {
	return wastage;
    }

    public void print()
    {
	System.out.println("Date : " + date.toString());
	System.out.println("The Daily Wastage For Different Items(in kg) Are :- ");
	System.out.println("Title		Wastage");
	Set set = wastage.entrySet();
	Iterator itr = set.iterator();
	while(itr.hasNext())
	{
	    Map.Entry entry = (Map.Entry)itr.next();
	    System.out.println("  " + entry.getKey() + "		    " + entry.getValue());
	}
    }
}
