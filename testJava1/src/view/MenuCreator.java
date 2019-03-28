package entity;

import controller.FoodController;

import java.util.Scanner;

public class MenuCreator {
    public void createMenu(){
        Scanner scanner = new Scanner(System.in);
        FoodController foodController = new FoodController();
        while (true){
            System.out.println("-----------------Foodyi------------");
            System.out.println("1.Thêm món ăn.");
            System.out.println("2.Hiển thị danh sách món ăn");
            System.out.println("3.Thoát chương trình.");
            System.out.println("------------------------------------");
            System.out.println("Vui lòng nhập lựa chọn của bạn (1,2,3): ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    foodController.addFood();
                    break;
                case 2:
                    System.out.println("Danh sách món ăn");
                    foodController.printList();
                    break;
                case 3: break;
                default:
                    System.out.println("Lựa chọn sai. Vui lòng chọn lại trong khoảng 1,2,3.");
                    break;
            }
            if (choice == 3) {
                System.out.println("Hẹn gặp lại.");
                break;
            }
        }
    }
}