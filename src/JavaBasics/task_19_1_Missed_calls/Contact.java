package JavaBasics.task_19_1_Missed_calls;

public class Contact {
    private String name;
    private String numberPhone;

    public Contact(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    @Override
    public String toString() {
        return "Name - " + name + ": NumberPhone - " + numberPhone;
    }
}
