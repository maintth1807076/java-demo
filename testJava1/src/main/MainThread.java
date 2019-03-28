package main;

import entity.Game;

import java.util.Scanner;

public class MainThread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên game: ");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả game: ");
        String description = scanner.nextLine();
        System.out.println("Nhập giá game: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày phát hành game: ");
        String createdDate = scanner.nextLine();
        System.out.println("Nhập trang chủ game: ");
        String website = scanner.nextLine();
        Game game = new Game(name, description, price, createdDate, website);
        System.out.println("Thông tin game là " + game.toString());
    }
}
