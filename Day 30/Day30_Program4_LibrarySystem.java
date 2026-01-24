class Book {
    String title;
    boolean issued = false;

    Book(String title) {
        this.title = title;
    }

    void issueBook() {
        if (!issued) {
            issued = true;
            System.out.println(title + " issued successfully");
        } else {
            System.out.println(title + " already issued");
        }
    }
}

class Day30_Program4_LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming");
        b1.issueBook();
        b1.issueBook();
    }
}
