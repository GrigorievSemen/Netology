package JavaBasics.task_12_1.persons;

import JavaBasics.task_12_1.users.Administrator;
import JavaBasics.task_12_1.users.Librarian;
import JavaBasics.task_12_1.users.Reader;
import JavaBasics.task_12_1.users.Supplier;

public class LibraryWorkers extends PersonAbstract implements Administrator, Librarian {

    public LibraryWorkers(String name, String profession) {
        super(name, profession);
    }

    @Override
    public void findBook(Reader reader) {
        System.out.println(this + " нашел(ла) книгу для " + reader);
    }

    @Override
    public void giveBook(Reader reader) {
        System.out.println(this + " отдала книгу для " + reader);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(this + " уведомил(а) " + reader + " о просрочке книги");

    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println(this + " заказал(а) книгу у " + supplier);
    }

    @Override
    public String toString() {
        return getName() + " (" + getProfession() + ") ";
    }
}
