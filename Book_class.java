class Book
{
    String title;
    String author;
    int price;

    Book()
    {
        title = "Ponniyin Selvan";
        author = "Kalki";
        price = 1600;
    }

    Book(String t,String a,int p)
    {
        title = t;
        author = a;
        price = p;
    }

    void displayBookDetails()
    {
        System.out.println("Book Name : "+title);
        System.out.println("Author Name : "+author);
        System.out.println("Price : "+price);
        System.out.println("=================================");
    }
}

public class Book_class {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Harry Potter","J.K. ROWLING",1200);

        b1.displayBookDetails();
        b2.displayBookDetails();

    }
}