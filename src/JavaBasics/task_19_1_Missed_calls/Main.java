package JavaBasics.task_19_1_Missed_calls;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PhoneBook phoneBook = new PhoneBook();

        Contact Slava = phoneBook.createContact("Slava", "999-999-99-99");
        Contact Igor = phoneBook.createContact("Igor", "777-777-77-77");

        phoneBook.createGroup("Friends");
        phoneBook.addContactToGroup(new ArrayList<>(List.of(Slava, Igor)), "Friends");

        phoneBook.createMissCalls("777-777-77-77");
        Thread.sleep(1000);
        phoneBook.createMissCalls("555-555-55-55");
        Thread.sleep(1000);
        phoneBook.createMissCalls("999-999-99-99");

        phoneBook.printMissCalls();
    }
}
