package project.backend.vo;

public class CartVO {

    private int page;
    private int limit;
    private int limit_st;
    private int cart_count;

    private String category;
    private String brand_name;
    private String url;

    private String FailMessage;
    private String SuccessMessage;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit_st() {
        return limit_st;
    }

    public void setLimit_st(int limit_st) {
        this.limit_st = limit_st;
    }

    public int getCart_count() {
        return cart_count;
    }

    public void setCart_count(int cart_count) {
        this.cart_count = cart_count;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFailMessage() {
        return FailMessage;
    }

    public void setFailMessage(String failMessage) {
        FailMessage = failMessage;
    }

    public String getSuccessMessage() {
        return SuccessMessage;
    }

    public void setSuccessMessage(String successMessage) {
        SuccessMessage = successMessage;
    }
}
