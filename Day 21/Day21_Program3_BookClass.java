class Book {
    String title;
    String author;
    int price;

    void printBook() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
    }
}

class Day21_Program3_BookClass {
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "James";
        b.price = 499;

        b.printBook();
    }
}
