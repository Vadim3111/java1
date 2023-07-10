package DZ5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public List<String> getPhoneNumbers(String name) {
        return contacts.get(name);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("John", "1234567890");
        phoneBook.addContact("John", "9876543210");
        phoneBook.addContact("Alice", "5555555555");

        List<String> johnPhoneNumbers = phoneBook.getPhoneNumbers("John");
        if (johnPhoneNumbers != null) {
            System.out.println("John's phone numbers:");
            for (String phoneNumber : johnPhoneNumbers) {
                System.out.println(phoneNumber);
            }
        } else {
            System.out.println("John not found in the phone book.");
        }
    }
}