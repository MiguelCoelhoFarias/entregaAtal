package quicksortLibary;

public class ListBook {
  public static final int INITIAL_SIZE = 10;
  Book[] books = new Book[INITIAL_SIZE];
  int size = 0;

  public void add(Book book) {
    if (size == books.length) {

      Book[] newBooks = new Book[books.length * 2];

      for (int i = 0; i < books.length; i++) {
        newBooks[i] = books[i];
      }

      books = newBooks;
    }

    books[size] = book;
    size++;
  }

  public Book get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
    }

    return books[index];
  }

  public int size() {
    return size;
  }

  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
    }

    for (int i = index; i < size - 1; i++) {
      books[i] = books[i + 1];
    }

    size--;
  }

  public void clear() {
    this.books = new Book[INITIAL_SIZE];
    size = 0;
  }

  public void listBooks() {
    for (int i = 0; i < size; i++) {
      System.out.println(books[i]);
    }
  }

  public void sortByTitle() {
    quickSortByTitle(0, size - 1);
  }

  private void quickSortByTitle(int low, int high) {
    if (low < high) {
      int pi = partitionByTitle(low, high);

      quickSortByTitle(low, pi - 1);
      quickSortByTitle(pi + 1, high);
    }
  }

  private int partitionByTitle(int low, int high) {
    String pivot = books[high].title;
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (books[j].title.compareTo(pivot) < 0) {
        i++;

        Book temp = books[i];
        books[i] = books[j];
        books[j] = temp;
      }
    }

    Book temp = books[i + 1];
    books[i + 1] = books[high];
    books[high] = temp;

    return i + 1;
  }

  public void sortByAuthor() {
    quickSortByAuthor(0, size - 1);
  }

  private void quickSortByAuthor(int low, int high) {
    if (low < high) {
      int pi = partitionByAuthor(low, high);

      quickSortByAuthor(low, pi - 1);
      quickSortByAuthor(pi + 1, high);
    }
  }

  private int partitionByAuthor(int low, int high) {
    String pivot = books[high].author;
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (books[j].author.compareTo(pivot) < 0) {
        i++;

        Book temp = books[i];
        books[i] = books[j];
        books[j] = temp;
      }
    }

    Book temp = books[i + 1];
    books[i + 1] = books[high];
    books[high] = temp;

    return i + 1;
  }

}
