package models;

public class Lendings {
    private int id;
    private int userId;
    private int bookId;
    private String dateOut;
    private String dateReturn;

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getDateOut() {
        return dateOut;
    }

    public String getDateReturn() {
        return dateReturn;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setDateOut(String dateOut) {
        this.dateOut = dateOut;
    }

    public void setDateReturn(String dateReturn) {
        this.dateReturn = dateReturn;
    }
}
