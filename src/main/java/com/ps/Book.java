package com.ps;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public void checkOut(String userName) {
        this.checkedOutTo = userName;
        this.isCheckedOut = true;
    }

    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }
}
