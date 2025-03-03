public class TextScanner {

    public String scan(Book book) {
        String text = "";
        for (Page p : book.pages) {
            text += p.text;
        }
        return text;
    }

    public String scan(Page page) {
        return page.text;
    }


    public static void main(String[] args) {
        Page p1 = new Page("This\nis\npage 1\n");
        Page p2 = new Page("This\nis\npage 2\n");
        Page p3 = new Page("This\nis\npage 3\n");

        Book book = new Book(new Page[] {p1, p3});

        TextScanner scanner = new TextScanner();

        System.out.println(scanner.scan(book));
        System.out.println();
        System.out.println(scanner.scan(p2));

    }

}

class Page{
    final String text;

    Page(String text) {
        this.text = text;
    }
}

class Book {
    final Page[] pages;

    Book(Page[] pages) {
        this.pages = pages;
    }
}
