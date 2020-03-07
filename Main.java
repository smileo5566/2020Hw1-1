import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count1 = scn.nextInt();

        Book book1 = new Book();
        book1.setName("Pride & Prejudice");
        book1.setAuthor("Jane Austen");
        book1.setISBN("9789865671655");
        book1.setDate("2015/09/10");
        book1.setLanguage("American English");

        Book book2 = new Book();
        book2.setName("黑色生活誌");
        book2.setAuthor("馬菲");
        book2.setISBN("9789887984290");
        book2.setDate("2020/03/26");
        book2.setLanguage("繁體中文");

        Book book3 = new Book();
        book3.setName("Harry Potter");
        book3.setAuthor("J,K,Rowling");
        book3.setISBN("9573317249");
        book3.setDate("2000/06/01");
        book3.setLanguage("American English");


        switch (count1){
            case 1 :
                System.out.println(book1.getName());
                System.out.println(book1.getAuthor());
                System.out.println(book1.getISBN());
                System.out.println(book1.getDate());
                System.out.println(book1.getLanguage());
                break;
            case 2 :
                System.out.println(book2.getName());
                System.out.println(book2.getAuthor());
                System.out.println(book2.getISBN());
                System.out.println(book2.getDate());
                System.out.println(book2.getLanguage());
                break;
            case 3 :
                System.out.println(book3.getName());
                System.out.println(book3.getAuthor());
                System.out.println(book3.getISBN());
                System.out.println(book3.getDate());
                System.out.println(book3.getLanguage());
                break;
                default:
                    System.out.println("查無此書");
        }

    }
}
