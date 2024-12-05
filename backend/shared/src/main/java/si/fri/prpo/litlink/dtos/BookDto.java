package si.fri.prpo.litlink.dtos;

public class BookDto {

    private Integer id;

    private String title;

    private String author;

    private Integer releaseDate;

    public BookDto() {

    }

    public BookDto(Integer id, String title, String author, int releaseDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer release) {
        this.releaseDate = release;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("title: ");
        sb.append(this.title);
        sb.append("<br/>author: ");
        sb.append(this.author);
        sb.append("<br/>Release date: ");
        sb.append(this.releaseDate);
        return sb.toString();
    }
}
