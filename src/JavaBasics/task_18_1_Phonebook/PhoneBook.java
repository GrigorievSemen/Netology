package JavaBasics.task_18_1_Phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> map;
    private List<Contact> allContacts;

    public PhoneBook() {
        this.allContacts = new ArrayList<>();
        this.map = new HashMap<>();
        map.put(null, allContacts);
    }

    public void createGroup(String group) {
        map.put(group, new ArrayList<>());
    }

    public void addContact(String name, String contact) {
        allContacts.add(new Contact(name, contact));
    }

    public void addContactToGroup(String KeyContact, String group) {
        if (isExistGroup(group)) {
        } else {
            Contact con = isExistContact(KeyContact, allContacts);
            if (con != null) {
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
        if (isExistGroup(group)) {
        } else {
            List<Contact> list = map.get(group);
            Contact con = isExistContact(contact, list);
            if (con != null) {
                return con;
            }
            System.out.printf("Контакта <%s> нет в группе <%s>\n", contact, group);
        }
        return new Contact("", "");
    }

    public Contact searchContactIntoContacts(String contact) {
        Contact con = isExistContact(contact, allContacts);
        if (con != null) {
            return con;
        }
        System.out.printf("Контакта <%s> нет в списке контактов\n", contact);
        return new Contact("", "");
    }

    private Contact isExistContact(String key, List<Contact> contacts) {
        Contact contact = null;
        for (int i = 0; i < contacts.size(); i++) {
            contact = contacts.get(i);
            if (contact.getName().equals(key) || contact.getNumberPhone().equals(key)) {
                return contact;
            }
        }
        return null;
    }

    private boolean isExistGroup(String key) {
        if (!map.containsKey(key)) {
            System.out.println("Такой группы не существует!");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------------------------------------------------------\n");

        for (Map.Entry<String, List<Contact>> param : map.entrySet()) {
            if (param.getKey() != null) {
                sb.append("Group: " + param.getKey() + "\n").append("Contacts:\n");
            } else {
                sb.append("All contacts:\n");
            }

            List list = param.getValue();
            for (int i = 0; i < list.size(); i++) {
                sb.append(i + 1 + ". ").append(list.get(i) + "\n");
            }
            sb.append("\n");
            sb.append("---------------------------------------------------------------------\n");
        }
        return sb.toString();
    }
}
