

public class BookFactory {

    private Book book;

    public BookFactory(){
        this.book = new Book(Genre.FANTASY);
        this.book.setName("JavaProg");
        this.book.setAuthor("John Doe");
        this.book.setGenre(Genre.FANTASY);
        this.book.setYear(2000);

    }


    public BookFactory(int type) {
        this.book = new Book(Genre.FANTASY);
        if (type == 1) {
            this.book.setGenre(Genre.FANTASY);
        } else if (type == 2) {
            this.book.setGenre(Genre.FICTION);
        } else if (type == 3) {
            this.book.setGenre(Genre.SCIENCE);
        } else {
            this.book.setGenre(null);
        }
    }




    public Book getBook() {
        return book;
    }


}
