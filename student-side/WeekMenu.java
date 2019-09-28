import java.sql.Timestamp;
import java.util.ArrayList;
import java.time.*;
import java.util.List;

public class WeekMenu{
    private int mWeekId;
    private List<DayMenu> mMenus;

    public WeekMenu(int mWeekId, List<DayMenu> mMenus) {
        this.mWeekId = mWeekId;
        this.mMenus = mMenus;
    }
    
    public void modifyWeekMenu(LocalDate date, DayMenu menu){
       
    }

    public void print(){
        System.out.println("WeekId :" + mWeekId + "\n");
        mMenus.forEach((e)->e.print());
    }
}