package JavaBasics.task_12_1;

import JavaBasics.task_12_1.persons.LibraryWorkers;
import JavaBasics.task_12_1.persons.VisitsLibrary;

public class Main {
    public static void main(String[] args) {

        LibraryWorkers administrator = new LibraryWorkers("Женя", "Администратор");
        LibraryWorkers library = new LibraryWorkers("Оля", "Библиотекарь");
        VisitsLibrary reader = new VisitsLibrary("Петя", "Читатель");
        VisitsLibrary supplier = new VisitsLibrary("Рома", "Поставщик");

        administrator.findBook(reader);
        library.findBook(supplier);
        library.giveBook(supplier);
        administrator.overdueNotification(supplier);
        administrator.orderBook(supplier);
        supplier.takeBook(administrator);
        reader.returnBook(library);
        supplier.supplyBook(library);
    }
}
