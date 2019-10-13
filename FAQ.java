import java.util.List;

public class FAQ{

    private int totalQues;
    private int totalAnswers;
    private List<FAQItem> faqs;

    public FAQ(List<FAQItem> faqs) {
        this.faqs = faqs;
    }

    public int getTotalQues() {
        return totalQues;
    }

    public void setTotalQues(int totalQues) {
        this.totalQues = totalQues;
    }

    public int getTotalAnswers() {
        return totalAnswers;
    }

    public void setTotalAnswers(int totalAnswers) {
        this.totalAnswers = totalAnswers;
    }

    public List<FAQItem> getFaqs() {
        return faqs;
    }

    public void setFaqs(List<FAQItem> faqs) {
        this.faqs = faqs;
    }

    @Override
    public String toString() {
        return "FAQ{" +
                "totalQues=" + totalQues +
                ", totalAnswers=" + totalAnswers +
                ", faqs=" + faqs +
                ", totalUnanswerd=" + (totalQues-totalAnswers) +
                '}';
    }
}