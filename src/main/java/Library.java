import java.util.ArrayList;
import java.util.List;


public class Library {
    private List<Book> listBooks;

    public Library(){
        this.listBooks = new ArrayList<Book>();
    }

    public void addBook(Book book){
        listBooks.add(book);
        System.err.println("Il libro " + book.getTitle() + "è stato aggiunto in libreria");
    }

    public void removeBook(String isbn){
        listBooks.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public List<Book> listBooks(){
        return listBooks;
    }

    public List<Book> getBooksByAuthor(String author){
        List<Book> listBooksAuthor = new ArrayList<Book>(); 
        for (Book book : listBooks) {
            if (book.getAuthor().equals(author)) {
                listBooksAuthor.add(book);
            }
        }
        return listBooksAuthor;
    }    
}
