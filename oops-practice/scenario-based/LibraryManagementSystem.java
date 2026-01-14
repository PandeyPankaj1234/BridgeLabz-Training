import java.util.*;
class BookNotAvailableException extends Exception{
    BookNotAvailableException(String msg){
        super(msg);
    }
}
class Book{
    private int bookId;
    private String title;
    private String author;
    private boolean available;
    Book(int bookId,String title,String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.available=true;
    }
    public int getBookId(){
        return bookId;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available=available;
    }
    public String toString(){
        return bookId + " | " + title + " | " + author + " | Available: " + available;
    }
}
class Library{
    private List<Book> books=new ArrayList<>();
    public void addBook(Book book){
        for(Book b:books){
            if(b.getBookId()==book.getBookId()){
                System.out.println("Duplicate Book Id not allowed");
                return;
            }
        }
        books.add(book);
        System.out.println("Book Added Successfully");
    }
   
    public void removeBook(int bookId) {
        books.removeIf(b -> b.getBookId() == bookId);
        System.out.println("Book removed if existed");
    }

    public void searchByTitle(String title){
        for(Book b:books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println(b);
            }
        }
    }
    public void searchByAuthor(String author){
        for(Book b:books){
            if(b.getAuthor().equalsIgnoreCase(author)){
                System.out.println(b);
            }
        }
    }
    public void borrowBook(int bookId) throws BookNotAvailableException{
        for(Book b:books){
            if(b.getBookId()==bookId){
                if(!b.isAvailable()){
                    throw new BookNotAvailableException("Book is not available");
                }
                b.setAvailable(false);
                System.out.println("Book Borrowed Successfully");
                return;
            }
        }
        System.out.println("Book not found");
    }

}
class LibraryManagementSystem{
    public static void main(String[] args) {
        Library lib=new Library();
        Book b1 = new Book(101, "Java", "James Gosling");
        Book b2 = new Book(102, "Python", "Guido");
        Book b3 = new Book(103, "DSA", "Mark");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.searchByAuthor("James Gosling");
        lib.removeBook(103);
        try {
            lib.borrowBook(101);
            lib.borrowBook(103);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}