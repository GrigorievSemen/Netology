package JavaBasics.task_18_1_Phonebook;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Contact Slava = phoneBook.createContact("Slava", "999-999-99-99");
        Contact Igor = phoneBook.createContact("Igor", "777-777-77-77");

        phoneBook.createGroup("Friends");
        phoneBook.createGroup("Work");

        phoneBook.addContactToGroup(Slava, new String[]{"Friends", "Work"});
        phoneBook.addContactToGroup(Igor, new String[]{"Friends"});

        System.out.println(Arrays.toString(phoneBook.searchContactsForGroup("Work")));

        System.out.println(phoneBook.searchContactByNumberPhone("999-999-99-99"));
        System.out.println(phoneBook.searchContactByNumberPhone("444-444-44-44"));

        System.out.println(phoneBook);
    }
}
