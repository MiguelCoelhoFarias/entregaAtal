package quicksortLibary;

public class Book {
  public String author;
  public String title;
  public int year;
  public String genre;

  public Book(String author, String title, int year, String genre) {
    this.author = author;
    this.title = title;
    this.year = year;
    this.genre = genre;
  }

  public String toString() {
    return "Autor: " + author + ", Título: " + title + ", Ano: " + year + ", Gênero: " + genre;
  }
}
