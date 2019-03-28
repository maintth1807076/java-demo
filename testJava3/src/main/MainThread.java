package main;

import controller.CategoryController;
import controller.FoodController;
import controller.MyController;
import view.CategoryMenu;
import view.FoodMenu;
import view.Menu;

import java.util.Scanner;

public class MainThread {

    public static void main(String[] args) {
        System.out.println("Quản lí món ăn");
        MyController controller = new CategoryController();
        MyController controller1 = new FoodController();
        controller.add();
        controller.add();
        Menu menu = new FoodMenu();
        controller1.add();
        controller1.printList();

    }
}
