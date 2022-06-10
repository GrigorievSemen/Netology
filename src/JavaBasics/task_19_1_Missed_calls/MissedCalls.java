package JavaBasics.task_19_1_Missed_calls;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy -(HH:mm:ss)");
    private Map<LocalDateTime, String> missedCalls = new TreeMap<>();
    private String numberPhone = null;
    private String nameContact = null;
    private Contact contact = null;
    private String time = null;

    public void addMissCalls(LocalDateTime ldt, String call) {
        this.missedCalls.put(ldt, call);
    }

    public void print(PhoneBook phoneBook) {
        StringBuilder sb = new StringBuilder();
        sb.append("_____________________________________________________").append("\nСписок пропущенных вызовов:\n");

        for (Map.Entry<LocalDateTime, String> param : missedCalls.entrySet()) {
            numberPhone = param.getValue();
            contact = phoneBook.searchContactByNumberPhone(numberPhone);
            nameContact = phoneBook.searchContactByNumberPhone(numberPhone) != null ? ". Caller: - " + contact.getName() : ". Caller: - " + numberPhone;
            time = dtf.format(param.getKey());

            sb.append("Time: - ").append(time).append(nameContact).append("\n");
        }

        sb.append("_____________________________________________________");
        System.out.println(sb);
    }
}



