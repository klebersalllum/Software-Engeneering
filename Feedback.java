import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

class Feedback {
    private String customerName;
    private String customerEmail;
    private String feedbackMessage;

    public Feedback(String customerName, String customerEmail, String feedbackMessage) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.feedbackMessage = feedbackMessage;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }
}