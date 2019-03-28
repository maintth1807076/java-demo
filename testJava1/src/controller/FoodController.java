package controller;

import entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController {
    private ArrayList<Food> list = new ArrayList<>();


    public void addFood() {
        Scanner scanner = new Scanner(System.in);
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
        Food food = new Food(foodId, name, description, price, createdDate);
        list.add(food);
        System.out.println("Đã thêm món ăn");
    }
    public void printList(){
        if (list == null || list.size() == 0){
            System.out.println("Hiện tại chưa có món ăn.");
            return;
        }
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Mã", "Tên món", "Giá", "Mô tả");
        for (int i = 0; i < list.size(); i++) {
            Food food = list.get(i);
            System.out.println(food.toString());
        }
    }
}