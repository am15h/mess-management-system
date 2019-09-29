public class FAQItem{

    private LocalDate date;
    private String ques;
    private String ans;

    public FAQItem(LocalDate date, String ques) {
        this.date = date;
        this.ques = ques;
    }

    public FAQItem(LocalDate date, String ques, String ans) {
        this.date = date;
        this.ques = ques;
        this.ans = ans;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "FAQItem{" +
                "date=" + date +
                ", ques='" + ques + '\'' +
                ", ans='" + ans + '\'' +
                '}';
    }
}