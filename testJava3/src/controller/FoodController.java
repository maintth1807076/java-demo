package controller;

import entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController implements MyController{
    private  ArrayList<Food> foodList = new ArrayList<>();
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        Food food = new Food();
        System.out.println("Nhập mã món ăn: ");
        String foodId = scanner.nextLine();
        System.out.println("Nhập tên món ăn: ");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả món ăn: ");
        String description = scanner.nextLine();
        System.out.println("Nhập giá món ăn: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày tạo món ăn: ");
        String createdDate = scanner.nextLine();
        System.out.println("Vui lòng chọn danh mục: ");
        CategoryController categoryController = new CategoryController();
        categoryController.printList();
        System.out.println("Nhập mã danh mục muốn chọn: ");
        String categoryId = scanner.nextLine();
//        String categoryName = categoryController.outputCategoryName(categoryId);
//        food.setCategoryId(categoryName);
        foodList.add(food);
    }
    @Override
    public void printList(){
        if (foodList == null || foodList.size() == 0){
            System.out.println("Hiện tại chưa có món ăn. Vui lòng thêm món ăn.");
            return;
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Mã", "Tên món", "Giá", "Mô tả", "Danh mục");
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            System.out.println(food.toString());
        }
    }
}
