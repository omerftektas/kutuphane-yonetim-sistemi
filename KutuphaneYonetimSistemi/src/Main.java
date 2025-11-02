import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String bookName;
    String author;
    int pages;
    double price;

    public void Display() {
        System.out.println("Kitabın Adı : " + this.bookName);
        System.out.println("Kitabın Yazarı : " + this.author);
        System.out.println("Kitabın Sayfası : " + this.pages);
        System.out.println("Kitabın Fiyatı : " + this.price);
    }
}


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;

        ArrayList<Book> Library = new ArrayList<>();

        while (input != 5) {
            System.out.println("KÜTÜPHANE YÖNETİM SİSTEMİ");
            System.out.println("1. Kitap Bilgisi Ekle");
            System.out.println("2. Kitap Bilgileri Göster");
            System.out.println("3. Yazara Ait Tüm Kitapları Göster");
            System.out.println("4. Kütüphanedeki Toplam Kitap Sayısını Göster");
            System.out.println("5. Çıkış Yap");

            System.out.print("Lütfen Seçim Yapınız : ");
            input = scanner.nextInt();

            switch (input) {
                case 1:
                    Book newBook = new Book();
                    scanner.nextLine();
                    System.out.print("Kitabın Adını Giriniz : ");
                    newBook.bookName = scanner.nextLine();

                    System.out.print("Kitabın Yazarını Giriniz : ");
                    newBook.author = scanner.nextLine();

                    System.out.print("Kitabın Sayfasını Giriniz : ");
                    newBook.pages = scanner.nextInt();

                    System.out.print("Kitabın Fiyatını Giriniz : ");
                    newBook.price = scanner.nextInt();

                    Library.add(newBook);
                    break;
                case 2:
                    if (Library.isEmpty()) {
                        System.out.println("Kütüpanede Kitap Yok !");
                    } else {
                        for (int i = 0; i < Library.size(); i++) {
                            System.out.println((i + 1) + ". Kitap");
                            Library.get(i).Display();
                            System.out.println(" ");
                            System.out.println("--------------------");
                        }
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Yazar Adını Giriniz : ");
                    String searchAuthor = scanner.nextLine();
                    for (Book book : Library) {
                        if (book.author.equalsIgnoreCase(searchAuthor)) {
                            System.out.println();
                            System.out.println(searchAuthor + "Yazarına Ait Kitaplar");
                            book.Display();
                            System.out.println("    ");
                            System.out.println("-----------");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Toplam Kitap Sayısı : ");
                    System.out.println(Library.size());
                    break;
                case 5:
                    System.out.println("Çıkış Yapılıyor...");
                    break;
                default:
                    System.out.println("**************************");
                    System.out.println("Hatalı Tuşlama Yaptınız !");
                    System.out.println("**************************");
                    break;
            }

        }
    }
}