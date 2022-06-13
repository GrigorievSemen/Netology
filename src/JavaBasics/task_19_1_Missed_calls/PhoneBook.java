package JavaBasics.task_19_1_Missed_calls;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> map;
    private MissedCalls missedCalls;

    public PhoneBook() {
        this.map = new HashMap<>();
        this.missedCalls = new MissedCalls();
    }

    public void printMissCalls() {
        missedCalls.print(this);
    }

    public void createMissCalls(String call) {
        missedCalls.addMissCalls(LocalDateTime.now(), call);
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
    public Contact[] searchСontactsForGroup(String group) {
        List<Contact> list = map.get(group);
        return list.toArray(new Contact[list.size()]);
    }

    @Override
    public String toString() {
        return getString(map);
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
        return null;
    }

}
