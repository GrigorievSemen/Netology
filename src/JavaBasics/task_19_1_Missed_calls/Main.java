package JavaBasics.task_19_1_Missed_calls;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PhoneBook phoneBook = new PhoneBook();

        Contact Slava = phoneBook.createContact("Slava", "999-999-99-99");
        Contact Igor = phoneBook.createContact("Igor", "777-777-77-77");

        phoneBook.createGroup("Friends");
        phoneBook.addContactToGroup(Slava, new String[]{"Friends"});
        phoneBook.addContactToGroup(Igor, new String[]{"Friends"});

        phoneBook.createMissCalls("777-777-77-77");
        Thread.sleep(1000);
        phoneBook.createMissCalls("555-555-55-55");
        Thread.sleep(1000);
        phoneBook.createMissCalls("999-999-99-99");

        phoneBook.printMissCalls();
    }
}
