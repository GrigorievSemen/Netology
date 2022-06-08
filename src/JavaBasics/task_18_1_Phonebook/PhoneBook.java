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

    public void addContactToGroup(Contact contact, String group) {
        if (isExistGroup(group)) {
        } else {
            for (Map.Entry<String, List<Contact>> param : map.entrySet()) {
                if (param.getKey().equals(group)) {
                    param.getValue().add(contact);
                    System.out.printf("Контакт <%s> успешно добавлен в группу <%s>\n", contact.getName(), group);
                    break;
                }
            }
        }
    }

    public Contact searchContactIntoGroup(Contact contact, String group) {
        if (isExistGroup(group)) {
        } else {
            for (Contact con : map.get(group)) {
                if (con.equals(contact)) {
                    return con;
                }
            }
            System.out.printf("Контакта <%s> нет в группе <%s> ", contact, group);
        }
        return null;
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
}
