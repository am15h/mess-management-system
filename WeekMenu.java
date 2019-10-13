import java.sql.Timestamp;
import java.util.ArrayList;
import java.time.*;
import java.util.List;

public class WeekMenu {
    private int weekId;
    private List<DayMenu> menus;

    public WeekMenu(int weekId, List<DayMenu> mMenus) {
        this.weekId = weekId;
        this.menus = mMenus;
    }

    public void modifyWeekMenu(DayMenu menu) {
        this.menus.add(menu);
    }

    public int getWeekId() {
        return weekId;
    }

    public void setWeekId(int weekId) {
        this.weekId = weekId;
    }

    public List<DayMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<DayMenu> menus) {
        this.menus = menus;
    }

    <<<<<<<HEAD

    public void print() {
        System.out.println("WeekId :" + weekId + "\n");
        menus.forEach((e) -> e.print());
=======

    public void print(){
	System.out.println();
        System.out.println("WeekId : " + weekId + "\n");
	System.out.println();
        menus.forEach((e)->e.print());
	System.out.println();
>>>>>>> 2e5a962c3d4fcfc6163c0dd477b3d74bfccc4016
    }

}
