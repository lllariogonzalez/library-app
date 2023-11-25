package models;

public class Books {
    private int id;
    private String title;
    private String date;
    private String author;
    private String gender;
    private int stock;
    private int available;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getAuthor() {
        return author;
    }

    public String getGender() {
        return gender;
    }

    public int getStock() {
        return stock;
    }

    public int getAvailable() {
        return available;
    }

    // Método toString sobrescrito para mostrar una representación del modelo de libro
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", gender='" + gender + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
