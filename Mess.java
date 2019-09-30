import java.util.*;
import java.time.*;

public class Mess{
    private DailyWastage dailyWastage;
    private FixedExpense fixedExpense;
    private WeeklyExpense weeklyExpense;
    private List<Worker> workers;
    private Worker manager;
    private FAQ faq;
    private List<LocalTIme> timings;

    public Mess(List<Worker> workers, Worker manager, List<LocalTIme> timings) {
        this.workers = workers;
        this.manager = manager;
        this.timings = timings;
    }

    public Mess(List<Worker> workers, Worker manager) {
        this.workers = workers;
        this.manager = manager;
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

    public List<LocalTIme> getTimings() {
        return timings;
    }

    public void setTimings(List<LocalTIme> timings) {
        this.timings = timings;
    }
}
