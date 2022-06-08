package JavaBasics.task_18_1_Phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Slava", "999-999-99-99");
        phoneBook.addContact("Masha", "888-888-88-88");
        phoneBook.addContact("Igor", "777-777-77-77");

        phoneBook.createGroup("Friends");
        phoneBook.createGroup("Work");

        phoneBook.addContactToGroup("Slava", "Parents"); //Такой группы не существует!
        phoneBook.addContactToGroup("Dima", "Friends"); //Такого контакта нет в списке контактов
        phoneBook.addContactToGroup("Slava", "Friends"); //Контакт <Slava> успешно добавлен(a) в группу <Friends>
        phoneBook.addContactToGroup("Igor", "Friends"); //Контакт <Igor> успешно добавлен(a) в группу <Friends>
        phoneBook.addContactToGroup("Slava", "Work"); //Контакт <Slava> успешно добавлен(a) в группу <Work>
        phoneBook.addContactToGroup("888-888-88-88", "Work"); //Контакт <Masha> успешно добавлен(a) в группу <Work>

        System.out.println(phoneBook.searchContactIntoGroup("Marina", "Friends"));// Контакта <Marina> нет в группе <Friends>
        System.out.println(phoneBook.searchContactIntoGroup("Igor", "Friends"));// Name - Igor: NumberPhone - 777-777-77-77
        System.out.println(phoneBook.searchContactIntoGroup("Igor", "Parentss"));// Такой группы не существует!
        System.out.println(phoneBook.searchContactIntoGroup("Igor", "Work"));// Контакта <Igor> нет в группе <Work>

        System.out.println(phoneBook.searchContactIntoContacts("Roma")); //Контакта <Roma> нет в списке контактов
        System.out.println(phoneBook.searchContactIntoContacts("Slava")); //Name - Slava: NumberPhone - 999-999-99-99
        System.out.println(phoneBook.searchContactIntoContacts("777-777-77-77")); //Name - Igor: NumberPhone - 777-777-77-77

        System.out.println(phoneBook);
        //Group: Friends
        //Contacts:
        //1. Name - Slava: NumberPhone - 999-999-99-99
        //2. Name - Igor: NumberPhone - 777-777-77-77
        //
        //Group: Work
        //Contacts:
        //1. Name - Slava: NumberPhone - 999-999-99-99
        //2. Name - Masha: NumberPhone - 888-888-88-88
    }
}
