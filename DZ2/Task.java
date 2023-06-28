import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                          "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                          "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

            JSONArray jsonArray = new JSONArray(json);
            StringBuilder resultBuilder = new StringBuilder();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String фамилия = jsonObject.getString("фамилия");
                String оценка = jsonObject.getString("оценка");
                String предмет = jsonObject.getString("предмет");

                String result = "Студент " + фамилия + " получил " + оценка + " по предмету " + предмет + ".";
                resultBuilder.append(result).append("\n");
            }

            String result = resultBuilder.toString();
            System.out.println(result);

            writeToFile("output.txt", result);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Ошибка при обработке JSON строки", e);
        }
    }

    private static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Ошибка при записи в файл", e);
        }
    }
}