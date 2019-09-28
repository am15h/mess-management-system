import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meal {

    private int mMealType;
    private List<String> mMealItems;

    public Meal(int mMealType, List<String> mMealItems) {
        this.mMealType = mMealType;
        this.mMealItems = mMealItems;
    }

    public void addMealItems(List<String> items){
        mMealItems.addAll(items);
    }

    public void modifyMealItems(List<String> items){
        mMealItems = items;
    }

    public void print(){
        switch (mMealType){
            case 0:
                System.out.println("    Breakfast: " + mMealItems);
                break;
            case 1:
                System.out.println("    Lunch: " + mMealItems);
                break;
            case 2:
                System.out.println("    Dinner: " + mMealItems);
                break;
        }
    }
}