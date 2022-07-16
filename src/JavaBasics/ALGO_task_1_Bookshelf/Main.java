package JavaBasics.ALGO_task_1_Bookshelf;

public class Main {
    public static void main(String[] args) {
        int[] books = new int[]{14, 16, 19, 32, 32, 32, 56, 69, 72};
        binarySearch(books, 32);
        binarySearch(books, 60);
        binarySearch(books, 19);
        binarySearch(books, 69);
        binarySearch(books, 14);
        binarySearch(books, 72);
        binarySearch(books, 1);
        binarySearch(books, 100);
    }

    public static void binarySearch(int[] books, int page) {
        int result = 0;
        int left = 0;
        int right = books.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;
            if (books[middle] <= page && books[middle + 1] > page) {
                result = books.length - middle - 1;
                break;
            } else if (books[middle] <= page) {
                left = middle + 1;
            } else if (books[middle] >= page) {
                right = middle - 1;
            }

            if (books[middle - 1] <= page && books[middle] > page) {
                result = books.length - left - 1;
            }

            if (books[0] > page) {
                result = books.length;
            }
        }
        System.out.printf("На книжной полке %d книг с большем кол-вом страниц чем %d.\n",
                result, page);
    }
}
