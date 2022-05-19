package project.backend.vo;

public class CountAdvertisingVO {

    private String category;
    private int sports_count;
    private int news_count;
    private int webtoon_count;

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
