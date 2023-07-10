package DZ5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов"
        );

        Map<String, Integer> nameCountMap = new HashMap<>();
        for (String employee : employees) {
            nameCountMap.put(employee, nameCountMap.getOrDefault(employee, 0) + 1);
        }

        Map<String, Integer> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(nameCountMap);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            System.out.println(name + ": " + count);
        }
    }
}