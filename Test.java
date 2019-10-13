import java.sql.Timestamp;
import java.util.ArrayList;

import java.util.*;
import java.time.*;

class Test {
    public static void main(String[] args) {
/*
        List<String> dummyData = new ArrayList<String>();
        dummyData.add("Dal");
        dummyData.add("Rice");
        dummyData.add("Chapati");
        dummyData.add("Shikanji");

        List<Meal> list = new ArrayList<Meal>();
        list.add(new Meal(0, dummyData));
        list.add(new Meal(1, dummyData));
        list.add(new Meal(2, dummyData));

        DayMenu daymenu = new DayMenu(LocalDate.now(), list);

        List<DayMenu> weeklist = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            weeklist.add(new DayMenu(LocalDate.now().plusDays(i), list));
        }

        WeekMenu weekMenu = new WeekMenu(33, weeklist);
        weekMenu.print();

        Map<String, Integer> data = new HashMap<String, Integer>();
        Integer val1 = Integer.valueOf(4);
        data.put("Dal     ", val1);
        val1 = Integer.valueOf(5);
        data.put("Rice    ", val1);
        val1 = Integer.valueOf(1);
        data.put("Chapati ", val1);
        val1 = Integer.valueOf(3);
        data.put("Shikanji", val1);

        DailyWastage dailywastage = new DailyWastage(LocalDate.now(), data);
        dailywastage.print();
        System.out.println();

        WeeklyExpense weeklyexpense = new WeeklyExpense(LocalDate.now(), data);
        weeklyexpense.print();
        System.out.println();

        Map<String, Integer> data1 = new HashMap<String, Integer>();
        val1 = Integer.valueOf(4);
        data1.put("Table", val1);
        val1 = Integer.valueOf(5);
        data1.put("Chair", val1);
        val1 = Integer.valueOf(1);
        data1.put("Light", val1);
        val1 = Integer.valueOf(3);
        data1.put("Fan  ", val1);
        FixedExpense fixedexpense = new FixedExpense(data1);
        fixedexpense.print();

*/
	Mess mymess = new Mess();


        List<Worker> lw = new ArrayList<Worker>();
	


	Worker w1 = new Worker(4001 , "Hari Prasad" , "Rajiv Bhawan" , 987654321 ,4000,LocalTime.of(7,30,0) , LocalTime.of(9,30,0));

	Worker w2 = new Worker(4002 , "Chintoo Lal" , "Rajiv Bhawan" , 987654321 ,4000,LocalTime.of(7,30,0) , LocalTime.of(9,30,0));

	Worker w3 = new Worker(4003 , "Ram Prasad" , "Rajiv Bhawan" , 987654321 ,4000,LocalTime.of(7,30,0) , LocalTime.of(9,30,0));

	Worker w4 = new Worker(4004 , "Hira Lal" , "Rajiv Bhawan" , 987654321 ,4000,LocalTime.of(7,30,0) , LocalTime.of(9,30,0));

	int id = 4005;
	lw.add(w1);
	lw.add(w2);
	lw.add(w3);
	lw.add(w4);

	mymess.setWorkers(lw);


List<Student> ls = new ArrayList<Student>();
	


Student s1 = new Student(184001 , "Hari Prasad" , "Rajiv Bhawan" , 987654321 , "champion@gmail.com");
Student s2 = new Student(184002 , "Chintoo Lal" , "Rajiv Bhawan" , 987654321 , "champion@gmail.com");
Student s3 = new Student(184003 , "Ram Prasad" , "Rajiv Bhawan" , 987654321 , "champion@gmail.com");
Student s4 = new Student(184004 , "Hira Lal" , "Rajiv Bhawan" , 987654321 , "champion@gmail.com");

ls.add(s1);
ls.add(s2);
ls.add(s3);
ls.add(s4);

mymess.setStudents(ls);

int sid = 184005;

	while(true)
	{
	    System.out.println('\n');
	    System.out.println("Please Select An Appropriate Option :");

	    System.out.println();
		System.out.println("1. Workers." );
		System.out.println("2. Students." );
		System.out.println("3. Display Mess Menu." );
		System.out.println("4. Timings. " );
		System.out.println("5. Mess Data." );
		System.out.println("6. FAQ." );
		System.out.println("7. Feedback");
		System.out.println("8. Exit" );
	        System.out.println('\n');
	
	    int op;
	    Scanner in = new Scanner(System.in);
	    op = in.nextInt();


	    if(op == 1)
	    {
		while(true)
		{
		    System.out.println('\n');
		    System.out.print("Select Suboption:");

		    System.out.println();
		    System.out.println("	    1. Display Workers.");
		    System.out.println("	    2. Add New Worker.");
		    System.out.println("	    3. Exit.");

		    int subop = in.nextInt();
		    if(subop == 1)
		    {
			mymess.getWorkers().forEach((e) -> e.print());				
		    }
		    else if(subop == 2)
		    {
			in.nextLine();
			System.out.print("Enter Name : ");
			String n1 = in.nextLine();
			System.out.println();

			System.out.print("Enter Hostel : ");
			String h1 = in.nextLine();
			System.out.println();

			System.out.print("Enter Phone Number : ");
			long p1 = in.nextLong();
			System.out.println();

			System.out.print("Enter Salary : ");
			long s11 = in.nextLong();
			System.out.println();

	Worker temp = new Worker(id , n1 , h1 , p1 , s11 ,LocalTime.of(7,30,0) , LocalTime.of(9,30,0));		
			lw.add(temp);		
			mymess.setWorkers(lw);
			id++;
		    }
		    else
		    {
			break;
		    }
		}
	    }

	    else if(op == 2)
	    {
		while(true)
		{
		    System.out.println('\n');
		    System.out.println("Select Suboption:");

		    System.out.println("	    1. Display Students.");
		    System.out.println("	    2. Add New Student.");
		    System.out.println("	    3. Exit.");

		    int subop = in.nextInt();
		    System.out.println();
		    if(subop == 1)
		    {
					mymess.getStudents().forEach((e) -> e.print());
		    }
		    else if(subop == 2)
		    {
		    		in.nextLine();
			System.out.print("Enter Name : ");
			String n1 = in.nextLine();
			System.out.println();

			System.out.print("Enter Hostel : ");
			String h1 = in.nextLine();
			System.out.println();

			System.out.print("Enter Phone Number : ");
			long p1 = in.nextLong();
			System.out.println();

				in.nextLine();
			System.out.print("Enter Email : ");
			String e1 = in.nextLine();
			System.out.println();

	Student	 temp = new Student	(sid , n1 , h1 , p1 , e1);		
			ls.add(temp);		
			mymess.setStudents(ls);
			sid++;
		    }
		    else
		    {
			break;
		    }
		}
	    }

	    else if(op == 3)
	    {
		//print menu
        List<String> dummyData = new ArrayList<String>();
        dummyData.add("Dal");
        dummyData.add("Rice");
        dummyData.add("Chapati");
        dummyData.add("Shikanji");

        List<Meal> list = new ArrayList<Meal>();
        list.add(new Meal(0, dummyData));
        list.add(new Meal(1, dummyData));
        list.add(new Meal(2, dummyData));

        DayMenu daymenu = new DayMenu(LocalDate.now(), list);

        List<DayMenu> weeklist = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            weeklist.add(new DayMenu(LocalDate.now().plusDays(i), list));
        }

        WeekMenu weekMenu = new WeekMenu(33, weeklist);
        weekMenu.print();
	    }

	    else if(op == 4)
	    {
		//timing
		System.out.println();
		System.out.println("Breakfast       :          07:30:00 - 09:30:00");
		System.out.println("Lunch           :          12:30:00 - 14:30:00");	
		System.out.println("Dinner          :          19:30:00 - 21:30:00");
		System.out.println();
	    }

	    else if(op == 5)
	    {	
		//mess data
		while(true)
		{
		    System.out.println('\n');
		    System.out.println("Select Suboption:");

		    System.out.println("	    1. Daily Wastage.");
		    System.out.println("	    2. Fixed Expense.");
		    System.out.println("	    3. Weekly Expense.");
		    System.out.println("	    4. Exit");

        Map<String, Integer> data = new HashMap<String, Integer>();
        Integer val1 = Integer.valueOf(4);
        data.put("Dal     ", val1);
        val1 = Integer.valueOf(5);
        data.put("Rice    ", val1);
        val1 = Integer.valueOf(1);
        data.put("Chapati ", val1);
        val1 = Integer.valueOf(3);
        data.put("Shikanji", val1);


        Map<String, Integer> data1 = new HashMap<String, Integer>();
        val1 = Integer.valueOf(4);
        data1.put("Table", val1);
        val1 = Integer.valueOf(5);
        data1.put("Chair", val1);
        val1 = Integer.valueOf(1);
        data1.put("Light", val1);
        val1 = Integer.valueOf(3);
        data1.put("Fan  ", val1);


		    int subop = in.nextInt();
		    if(subop == 1)
		    {
			System.out.println();
			System.out.println();
        DailyWastage dailywastage = new DailyWastage(LocalDate.now(), data);
        dailywastage.print();
        System.out.println('\n');

		    }
		    else if(subop == 2)
		    {
			System.out.println();
        FixedExpense fixedexpense = new FixedExpense(data1);
        fixedexpense.print();
	System.out.println('\n');
		    }
		    else if(subop == 3)
		    {
			System.out.println();
        WeeklyExpense weeklyexpense = new WeeklyExpense(LocalDate.now(), data);
        weeklyexpense.print();
        System.out.println('\n');
		    }
		    else
		    {
			break;
		    }
		}
	    }
	    
	    else if(op == 6)
	    {
		//FAQ
	    }

	    else if(op == 7)
	    {
		//feedback
	    }

	    else
	    {
			break;
	    }

	}
    }
}
