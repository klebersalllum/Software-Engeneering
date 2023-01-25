import java.io.IOException;

import com.google.gson.Gson;

class FeedbackRepository {
    private static final String FILE_NAME = "feedbacks.json";

    public void save(Feedback feedback) {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(feedback);
            FileWriter writer = new FileWriter(FILE_NAME);
            writer.write(json);
            writer.close();
            System.out.println("Feedback saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving feedback.");
        }
    }
}