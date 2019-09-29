import java.sql.Timestamp;
import java.util.ArrayList;

import java.util.*;
import java.time.*;

class Test {
    public static void main(String[] args) {

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
    }
}