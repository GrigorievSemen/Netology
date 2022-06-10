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

    public void createGroup(String group) {
        map.put(group, new ArrayList<>());
    }

    public Contact createContact(String name, String contact) {
        return new Contact(name, contact);
    }

    public static String getString(Map<String, List<Contact>> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------------------------------------\n");

        for (Map.Entry<String, List<Contact>> param : map.entrySet()) {
            sb.append("Group: " + param.getKey() + "\n").append("Contacts:\n");

            List list = param.getValue();
            for (int i = 0; i < list.size(); i++) {
                sb.append(i + 1 + ". ").append(list.get(i) + "\n");
            }
            sb.append("\n");
            sb.append("---------------------------------------------------------------------\n");
        }
        return sb.toString();
    }

    public void addContactToGroup(List<Contact> contacts, String... groups) {
        for (String group : groups) {
            map.put(group, contacts);
            System.out.printf("Контакты успешно добавлены в группу <%s>\n", group);
        }
    }

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

    public Contact searchContactIntoGroup(Contact contact, String group) {
        for (Contact con : map.get(group)) {
            if (con.equals(contact)) {
                return con;
            }
        }
        System.out.printf("Контакта <%s> нет в группе <%s> ", contact.getName(), group);
        return null;
    }

    @Override
    public String toString() {
        return getString(map);
    }
}
