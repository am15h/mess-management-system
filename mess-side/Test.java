import java.sql.Timestamp;
import java.util.ArrayList;

import java.util.List;
import java.time.*;

class Test{
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
        for(int i = 0; i < 7; i++){
            weeklist.add(new DayMenu(LocalDate.now().plusDays(i), list));
        }

        WeekMenu weekMenu = new WeekMenu(33, weeklist);
        weekMenu.print();
    }
}