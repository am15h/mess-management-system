import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meal {

    private int mMealType;
    private List<String> mMealItems;
    private List<Feedback> feedBacks;

    public Meal(int mMealType, List<String> mMealItems) {
        this.mMealType = mMealType;
        this.mMealItems = mMealItems;
    }

    public List<Feedback> getFeebacks() {
        return feedBacks;
    }

    public void addFeedback(Feedback feedback) {
        feedBacks.add(feedback);
    }

    public void addMealItems(List<String> items) {
        mMealItems.addAll(items);
    }

    public void modifyMealItems(List<String> items) {
        mMealItems = items;
    }

    <<<<<<<HEAD

    public void print() {
        switch (mMealType) {
        case 0:
            System.out.println("    Breakfast: " + mMealItems);
            break;
        case 1:
            System.out.println("    Lunch: " + mMealItems);
            break;
        case 2:
            System.out.println("    Dinner: " + mMealItems);
            break;
=======

    public void print(){
        switch (mMealType){
            case 0:
                System.out.println("    Breakfast :    " + mMealItems);
                break;
            case 1:
                System.out.println("    Lunch     :    " + mMealItems);
                break;
            case 2:
                System.out.println("    Dinner    :    " + mMealItems);
                break;
>>>>>>> 2e5a962c3d4fcfc6163c0dd477b3d74bfccc4016
        }
    }
}
