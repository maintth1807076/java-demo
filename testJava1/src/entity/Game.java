package entity;

public class Game{
    private String name;
    private String description;
    private int price;
    private  String createdDate;
    private String website;

    public Game() {
    }

    public Game(String name, String description, int price, String createdDate, String website) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdDate = createdDate;
        this.website = website;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString(){
        return "tên: " + name + ", mô tả: " + description + ", giá: " + price + ", ngày phát hành: " + createdDate + ", trang chủ: " + website;
    }
}
