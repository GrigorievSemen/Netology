package JavaBasics.task_12_1.persons;

import JavaBasics.task_12_1.users.Librarian;
import JavaBasics.task_12_1.users.Reader;
import JavaBasics.task_12_1.users.Supplier;

public class VisitsLibrary extends PersonAbstract implements Reader, Supplier {

    public VisitsLibrary(String name, String profession) {
        super(name, profession);
    }

    @Override
    public void takeBook(Librarian librarian) {
        System.out.println(this + " получил(а) книгу от " + librarian);
    }

    @Override
    public void returnBook(Librarian librarian) {
        System.out.println(this + " вернул(а) книгу " + librarian);
    }

    @Override
    public void supplyBook(Librarian librarian) {
        System.out.println(this + " доставил(а) новую книгу для " + librarian);
    }

    @Override
    public String toString() {
        return getName() + " (" + getProfession() + ") ";
    }
}
