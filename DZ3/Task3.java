import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Марс");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Меркурий");
        planets.add("Марс");
        planets.add("Уран");
        planets.add("Марс");
        planets.add("Сатурн");
        planets.add("Меркурий");

        for (String planet : planets) {
            int frequency = Collections.frequency(planets, planet);
            System.out.println("Планета: " + planet + ", повторений: " + frequency);
        }
    }
}