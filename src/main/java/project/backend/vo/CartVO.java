package project.backend.vo;

public class CartVO {

    private int page;
    private int limit;
    private int limit_st;
    private int cart_count;

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
}
