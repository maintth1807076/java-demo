package entity;

public class Food {
    private String foodId;
    private String foodName;
    private String description;
    private int price;
    private String createdDate;


    public Food() {
    }

    public Food(String foodId, String foodName, String description, int price, String createdDate) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.description = description;
        this.price = price;
        this.createdDate = createdDate;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
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

    @Override
    public String toString() {
        return String.format("%-10s %-10s %-10d %-10s", foodId, foodName, price, description);
    }
}
