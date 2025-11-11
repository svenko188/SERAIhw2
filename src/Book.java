

public class Book implements BookInterface {

    private Genre genre;
    private String title;
    private String author;
    private int year;
    @Override
    public void readBook(){
        System.out.println("I am reading a "+ this.genre + " book.");
    }

    public Book (Genre genre){
        this.genre = genre;
    }
    public Genre getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

