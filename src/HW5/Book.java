package HW5;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Book {
    private  String namebook;
    private  String authorbook;
    private  String year;

    public  Book(String name, String authorbook, String year) {
        this.namebook = name;
        this.authorbook = authorbook;
        this.year = year;
    }

    public String getName() {
        return namebook;
    }

    public void setName(String name) {
        this.namebook = name;
    }

    public String getAuthorbook() {
        return authorbook;
    }

    public void setAuthorbook(String authorbook) {
        this.authorbook = authorbook;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public void takebook (String name) {
        System.out.println(name +" взял книги");
    }
    public void takeBook (String name, String... namebooks) {
        System.out.println(name + "взял несколько книг" + name);
        for (String namebook : namebooks) {

            System.out.println(namebook);
        }
        System.out.println("взял книги с названием");

    }
    public void takeBook (String...Books) {
        System.out.println("название книг");
        for (String Book : Books) {
            System.out.println(Book);
        }
        System.out.println("взял книги");
    }

    public void returnBook (String name) {
        System.out.println(name + " вернул книги");
    }
    public void returnBook (String name, String... namebooks) {
        System.out.println(name + "вернул несколько книг" + name);
        for (String namebook : namebooks) {
            System.out.println(namebook);
        }
        System.out.println("вернул книги с названием");

    }
    public void returnBook (String...Books) {
        System.out.println("название книг");
        for (String Book : Books) {
            System.out.println(Book);
        }
        System.out.println("вернул книги");
    }
        public String getBookInfo () {
            return "[Назва: " + namebook + ", автор: " + authorbook + ", рік видання: " + year + "]";

        }

    }


