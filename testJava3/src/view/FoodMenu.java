package view;

import controller.FoodController;
import controller.MyController;
import view.Menu;

import java.util.Scanner;

public class FoodMenu implements Menu {
    @Override
    public void createMenu(MyController controller){
        Scanner scanner = new Scanner(System.in);
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
                    controller.add();
                    break;
                case 2:
                    System.out.println("Danh sách món ăn");
                    controller.printList();
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
