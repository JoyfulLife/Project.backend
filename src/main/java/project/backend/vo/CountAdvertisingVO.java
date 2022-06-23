package project.backend.vo;

public class CountAdvertisingVO {

    private String category;
    private int all_count;
    private int sports_count;
    private int shoping_count;
    private int book_count;

    public int getAll_count() {
        return all_count;
    }

    public void setAll_count(int all_count) {
        this.all_count = all_count;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSports_count() {
        return sports_count;
    }

    public void setSports_count(int sports_count) {
        this.sports_count = sports_count;
    }

    public int getShoping_count() {
        return shoping_count;
    }

    public void setShoping_count(int shoping_count) {
        this.shoping_count = shoping_count;
    }

    public int getBook_count() {
        return book_count;
    }

    public void setBook_count(int book_count) {
        this.book_count = book_count;
    }
}
