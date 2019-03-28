package main;

import entity.MenuCreator;

public class MainThread {


    public static void main(String[] args) {
        MenuCreator menuCreator = new MenuCreator();
        menuCreator.createMenu();
    }
}