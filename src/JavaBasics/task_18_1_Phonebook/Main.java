package JavaBasics.task_18_1_Phonebook;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Contact Slava = phoneBook.createContact("Slava", "999-999-99-99");
        Contact Igor = phoneBook.createContact("Igor", "777-777-77-77");

        phoneBook.createGroup("Friends");
        phoneBook.createGroup("Work");

        phoneBook.addContactToGroup(new ArrayList<>(List.of(Slava)), "Friends", "Work"); //Контакты успешно добавлены в группу <Friends> Контакты успешно добавлены в группу <Work>

        System.out.println(phoneBook.searchContactIntoGroup(Igor, "Work"));// Контакта <Igor> нет в группе <Work> null
        System.out.println(phoneBook.searchContactIntoGroup(Slava, "Work"));// Name - Slava: NumberPhone - 999-999-99-99

        System.out.println(phoneBook.searchContactByNumberPhone("999-999-99-99")); //Name - Slava: NumberPhone - 999-999-99-99
        System.out.println(phoneBook.searchContactByNumberPhone("444-444-44-44")); //Контакта <444-444-44-44> нет в списке контактов null

        System.out.println(phoneBook);
//        ---------------------------------------------------------------------
//        Group: Friends
//        Contacts:
//        1. Name - Slava: NumberPhone - 999-999-99-99
//
//        ---------------------------------------------------------------------
//        Group: Work
//        Contacts:
//        1. Name - Slava: NumberPhone - 999-999-99-99
//
//        ---------------------------------------------------------------------
    }
}
