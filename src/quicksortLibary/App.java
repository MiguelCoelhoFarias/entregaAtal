package quicksortLibary;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListBook list = new ListBook();
    int option = 0;

    while (option != 6) {
      System.out.println("\nSistema de Gerenciamento da Biblioteca Unifacisa");
      System.out.println("1. Adicionar Livro");
      System.out.println("2. Listar Livros:");
      System.out.println("3. Ordenar por Titulo");
      System.out.println("4. Ordenar por Autor");
      System.out.println("5. Pegar pelo index");
      System.out.println("6. Sair");
      System.out.println("Escolha uma opção: ");
      option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
        case 1:
          System.out.println("Digite o nome do autor: ");
          String author = scanner.nextLine();
          System.out.println("Digite o título do livro: ");
          String title = scanner.nextLine();
          System.out.println("Digite o ano de publicação: ");
          int year = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Digite o gênero do livro: ");
          String genre = scanner.nextLine();
          Book newBook = new Book(author, title, year, genre);
          list.add(newBook);
          break;
        case 2:
          list.listBooks();
          break;
        case 3:
          list.sortByTitle();
          System.out.println('-' * 50);
          System.out.println("Livros ordenados por título:");
          System.out.println('-' * 50);
          list.listBooks();
          break;
        case 4:
          list.sortByAuthor();
          System.out.println('-' * 50);
          System.out.println("Livros ordenados por autor: ");
          System.out.println('-' * 50);
          list.listBooks();
          break;
        case 5:
          System.out.println("Digite o index do livro: ");
          int index = scanner.nextInt();
          scanner.nextLine();
          System.out.println(list.get(index));
          break;
        case 6:
          System.out.println("Sistema Finalizado! Volte sempre ^^ ");
          return;
        default:
          System.out.println("Opção inválida!");
      }
    }

    scanner.close();
  }
}