package JavaBasics.task_18_1_Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> map;
    private List<Contact> allContacts;

    public PhoneBook() {
        this.map = new HashMap<>();
        this.allContacts = new ArrayList<>();
    }

    public void createGroup(String group) {
        map.put(group, new ArrayList<>());
    }

    public void addContact(String name, String contact) {
        allContacts.add(new Contact(name, contact));
    }

    public void addContactToGroup(String contact, String group) {
        if (!isExistGroup(group)) {
        } else {
            int i = isExistContact(contact, allContacts);
            if (i >= 0) {
                Contact con = allContacts.get(i);
                List<Contact> list = map.get(group);
                list.add(con);
                map.put(group, list);
                System.out.printf("Контакт <%s> успешно добавлен(a) в группу <%s>\n", con.getName(), group);
            } else {
                System.out.println("Такого контакта нет в списке контактов");
            }
        }
    }

    public Contact searchContactIntoGroup(String contact, String group) {
        if (!isExistGroup(group)) {
        } else {
            List<Contact> list = map.get(group);
            int i = isExistContact(contact, list);
            if (i >= 0) {
                return list.get(i);
            }
            System.out.printf("Контакта <%s> нет в группе <%s>\n", contact, group);
        }

        return new Contact("", "");
    }

    public Contact searchContactIntoContacts(String contact) {
        int i = isExistContact(contact, allContacts);
        if (i >= 0) {
            return allContacts.get(i);
        }
        System.out.printf("Контакта <%s> нет в списке контактов\n", contact);
        return new Contact("", "");
    }


    private int isExistContact(String key, List<Contact> contacts) {
        Contact contact = null;
        for (int i = 0; i < contacts.size(); i++) {
            contact = contacts.get(i);
            if (contact.getName().equals(key) || contact.getNumberPhone().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isExistGroup(String key) {
        if (!map.containsKey(key)) {
            System.out.println("Такой группы не существует!");
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, List<Contact>> param : map.entrySet()) {
            sb.append("Group: ").append(param.getKey() + "\n").append("Contacts:\n");

            List list = param.getValue();
            for (int i = 0; i < list.size(); i++) {
                sb.append(i + 1 + ". ").append(list.get(i) + "\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
