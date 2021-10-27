package book.adapter_18093421_LeVanTai;

public class Book {
    private String title;
    private int images;
    public Book()
    {

    }
    public Book(String title, int images)
    {
        this.title=title;
        this.images=images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
