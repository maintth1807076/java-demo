package controller;

import entity.Category;
import java.util.ArrayList;
import java.util.Scanner;

public class CategoryController implements MyController {
    private ArrayList<Category> categoryList = new ArrayList<>();
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã danh mục: ");
        String categoryId = scanner.nextLine();
        System.out.println("Nhập tên danh mục: ");
        String categoryName = scanner.nextLine();
        Category category = new Category(categoryId, categoryName);
        categoryList.add(category);
        System.out.println("Đã thêm danh mục");
    }

    @Override
    public void printList() {
        if (categoryList == null || categoryList.size() == 0){
            System.out.println("Hiện tại chưa có món ăn. Vui lòng thêm món ăn.");
            return;
        }
        for (int i = 0; i < categoryList.size(); i++) {
            Category category = categoryList.get(i);
            System.out.println(category.getCategoryId() + " - " + category.getCategoryName());
        }
    }
    public String outputCategoryName(String categoryId){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vui lòng nhập mã danh mục muốn chọn: ");
//        String categoryIdChoose = scanner.nextLine();
        Category category = null;
        for (int i = 0; i < categoryList.size(); i++) {
            if (categoryList.get(i).getCategoryId().equals(categoryId)){
                category = categoryList.get(i);
                break;
            }
        }
        String categoryName = category.getCategoryName();
        return categoryName;
    }
}
