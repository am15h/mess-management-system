import java.time.*;

public class Feedback {

    private LocalDate date;
    private String title;
    private String desc;

    public Feedback(LocalDate date, String title, String desc) {
        this.date = date;
        this.title = title;
        this.desc = desc;
    }

    public Feedback(LocalDate date, String title) {
        this.date = date;
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void print(){

        System.out.println("Feedback");
        System.out.println("Date : " + date);
        System.out.println("    Title : " + title);
        System.out.println("    Desc  : " + desc);
    }
}