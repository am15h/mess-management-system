import java.util.*;
import java.time.*;
import java.util.List;

public class Mess{
    private DailyWastage dailyWastage;
    private FixedExpense fixedExpense;
    private WeeklyExpense weeklyExpense;
    private List<Worker> workers;
    private Worker manager;
    private FAQ faq;
    private List<LocalTime> timings;
    private List<Student> students;
    private WeekMenu weekMenu;
    
    public Mess()
    {

    }

    public Mess(List<Worker> workers, Worker manager, List<Student> students) {
        this.workers = workers;
        this.manager = manager;
        this.students = students;
    }

    public WeekMenu getWeekMenu(){
        return weekMenu;
    }

    public void setWeekMenu(WeekMenu weekMenu){
        this.weekMenu = weekMenu;
    }

    public DailyWastage getDailyWastage() {
        return dailyWastage;
    }

    public void setDailyWastage(DailyWastage dailyWastage) {
        this.dailyWastage = dailyWastage;
    }

    public FixedExpense getFixedExpense() {
        return fixedExpense;
    }

    public void setFixedExpense(FixedExpense fixedExpense) {
        this.fixedExpense = fixedExpense;
    }

    public WeeklyExpense getWeeklyExpense() {
        return weeklyExpense;
    }

    public void setWeeklyExpense(WeeklyExpense weeklyExpense) {
        this.weeklyExpense = weeklyExpense;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }

    public Worker getManager() {
        return manager;
    }

    public void setManager(Worker manager) {
        this.manager = manager;
    }

    public FAQ getFaq() {
        return faq;
    }

    public void setFaq(FAQ faq) {
        this.faq = faq;
    }

    public List<LocalTime> getTimings() {
        return timings;
    }

    public void setTimings(List<LocalTime> timings) {
        this.timings = timings;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addWorker(Worker worker){
        workers.add(worker);
    }
}
