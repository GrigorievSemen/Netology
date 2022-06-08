package JavaBasics.task_18_1_Phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Contact Slava = phoneBook.createContact("Slava", "999-999-99-99");
        Contact Igor = phoneBook.createContact("Igor", "777-777-77-77");

        phoneBook.createGroup("Friends");
        phoneBook.createGroup("Work");

        phoneBook.addContactToGroup(Slava, "Friends"); //Контакт <Slava> успешно добавлен в группу <Friends>
        phoneBook.addContactToGroup(Igor, "Friends"); //Контакт <Igor> успешно добавлен в группу <Friends>
        phoneBook.addContactToGroup(Slava, "Work"); //Контакт <Slava> успешно добавлен в группу <Work>

        System.out.println(phoneBook.searchContactIntoGroup(Igor, "Work"));// Контакта <Igor> нет в группе <Work>
        System.out.println(phoneBook.searchContactIntoGroup(Igor, "Friends"));// Name - Igor: NumberPhone - 777-777-77-77

        System.out.println(phoneBook.searchContactByNumberPhone("999-999-99-99")); //Name - Slava: NumberPhone - 999-999-99-99
        System.out.println(phoneBook.searchContactByNumberPhone("444-444-44-44")); //Контакта <444-444-44-44> нет в списке контактов

        System.out.println(phoneBook);
//        ---------------------------------------------------------------------
//        Group: Friends
//        Contacts:
//        1. Name - Slava: NumberPhone - 999-999-99-99
//        2. Name - Igor: NumberPhone - 777-777-77-77
//
//        ---------------------------------------------------------------------
//        Group: Work
//        Contacts:
//        1. Name - Slava: NumberPhone - 999-999-99-99
//
//        ---------------------------------------------------------------------
    }
}
