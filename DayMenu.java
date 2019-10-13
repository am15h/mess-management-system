import java.sql.Timestamp;
import java.util.ArrayList;
import java.time.*;
import java.util.List;

public class DayMenu {

    private LocalDate mDate;
    private List<Meal> mMeals;

    public DayMenu(LocalDate mDate, List<Meal> mMeals) {
        this.mDate = mDate;
        this.mMeals = mMeals;
    }

    public void addMeal(Meal meal) {
        mMeals.add(meal);
    }

    public List<Meal> getMeals() {
        return mMeals;
    }

    public void print() {
        System.out.println("Date: " + mDate.toString());
        mMeals.forEach((meal) -> meal.print());

    }
}
