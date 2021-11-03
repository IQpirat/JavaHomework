package HW5;

public class takeBook {
    public static void main(String[] args) {

        Book book1 = new Book("Планета", "Гемес", "1890 рік");
        Book book2 = new Book("Чорнобиль", "Петрушка", "1990 рік");
        Book book3 = new Book("чорний лебідь", "маслоі", "2019 рік");

        book1.setName("наука");
        book2.setName("історія");
        book3.setName("пригоди");

        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());
        System.out.println(book3.getBookInfo());

        Reader reader1 = new Reader("ваня  ", 1231, "1", "10.11.95", "0991235");
        Reader reader2 = new Reader(" петя ", 1256, "2", "05.10.96", "0958264");
        Reader reader3 = new Reader("галя  ", 2125, "3", "02.11.97", "096475812");
        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());

        book1.takebook(reader1.getName()  + book1.getName() +"_" +"автора" +"_" + book1.getAuthorbook() +"_" + book2.getYear() ) ;
        book2.takebook(reader3.getName()  + book3.getName()   +  "_"+  book3.getAuthorbook()   + "_" +  book3.getYear());
        book3.takebook(reader2.getName()  +   book2.getName()  + "_" + book2.getAuthorbook()   + "_"  + book2.getYear());
        System.out.println();

        book1.returnBook(reader1.getName() + book1.getName() +"_" +"автора" +"_" + book1.getAuthorbook() +"_" + book2.getYear());
        book2.returnBook(reader1.getName() + book3.getName()   +  "_"+  book3.getAuthorbook()   + "_" +  book3.getYear());
        book3.returnBook(reader3.getName() +   book2.getName()  + "_" + book2.getAuthorbook()   + "_"  + book2.getYear());
        System.out.println();
    }
}
