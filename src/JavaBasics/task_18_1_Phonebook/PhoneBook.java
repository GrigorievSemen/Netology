package JavaBasics.task_18_1_Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> map;

    public PhoneBook() {
        this.map = new HashMap<>();
    }

    // метод создания группы
    public void createGroup(String group) {
        map.put(group, new ArrayList<>());
    }

    // метод создания контакта
    public Contact createContact(String name, String contact) {
        return new Contact(name, contact);
    }

    // метод добавления контакта в разные группы
    public void addContactToGroup(Contact contact, String[] groups) {
        for (String group : groups) {
            if (map.containsKey(group)) {
                map.get(group).add(contact);
                System.out.printf("Контакт <%s> успешно добавлены в группу <%s>\n", contact, group);
            }
        }
    }

    // метод получения контактов по группе
    public Contact[] searchContactsForGroup(String group) {
        List<Contact> list = map.get(group);
        return list.toArray(new Contact[list.size()]);
    }

    // метод получения контакта по номеру
    public Contact searchContactByNumberPhone(String contact) {
        for (Map.Entry<String, List<Contact>> param : map.entrySet()) {
            for (Contact con : param.getValue()) {
                if (con.getNumberPhone().equals(contact)) {
                    return con;
                }
            }
        }
        System.out.printf("Контакта <%s> нет в списке контактов ", contact);
        return null;
    }

    @Override
    public String toString() {
        return getString(map);
    }

    public static String getString(Map<String, List<Contact>> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------------------------------------\n");

        for (Map.Entry<String, List<Contact>> param : map.entrySet()) {
            sb.append("Group: " + param.getKey() + "\n").append("Contacts:\n");

            List<Contact> list = param.getValue();
            for (int i = 0; i < list.size(); i++) {
                sb.append(i + 1).append(". ").append(list.get(i)).append("\n");
            }
            sb.append("\n");
            sb.append("---------------------------------------------------------------------\n");
        }
        return sb.toString();
    }
}
