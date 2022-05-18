package project.backend.vo;

public class AdvertisingVO {

    private String ad_no;
    private String category;
    private String create_date;
    private String user_id;
    private String url;
    private String brand_name;
    private int sports_count;
    private int news_count;
    private int webtoon_count;

    public String getAd_no() {
        return ad_no;
    }

    public void setAd_no(String ad_no) {
        this.ad_no = ad_no;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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


    public int getSports_count() {
        return sports_count;
    }

    public void setSports_count(int sports_count) {
        this.sports_count = sports_count;
    }

    public int getNews_count() {
        return news_count;
    }

    public void setNews_count(int news_count) {
        this.news_count = news_count;
    }

    public int getWebtoon_count() {
        return webtoon_count;
    }

    public void setWebtoon_count(int webtoon_count) {
        this.webtoon_count = webtoon_count;
    }
}
