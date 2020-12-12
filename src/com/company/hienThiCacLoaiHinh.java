package com.company;

import java.util.Scanner;

public class hienThiCacLoaiHinh {

    public static void main(String[] args) {
        // write your code here
        int choice = new hienThiCacLoaiHinh().showMenu();
        while (choice!=0){
            switch (choice) {
                case 1:
                    String st = new hienThiCacLoaiHinh().printRectangle();
                    System.out.println(st);
                    break;
                case 2:
                    new hienThiCacLoaiHinh().printTriangle();
                    break;
                case 3:
                    System.out.println("I'm just Kidding");
                    break;
            }
            choice = new hienThiCacLoaiHinh().showMenu();
        }
    }

    public int showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Please enter your choice");
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles:" +
                " top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        choice = scanner.nextInt();
        return choice;
    }

    public String printRectangle() {
        String rec = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                rec += "*\t*\t";
            }
            rec += "\n";
        }
        return rec;
    }

    public void printTriangle() {
        String st = "";
        //top left
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                st += "*";
            }
            st += "\n";
        }
        System.out.println(st + "\n");
        //top right
        st = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                st += " ";
            }
            for (int j = 0; j < 5 - i; j++) {
                st += "*";
            }
            st += "\n";
        }
        System.out.println(st + "\n");
        //button left
        st = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                st += "*";
            }
            st += "\n";
        }
        System.out.println(st + "\n");
        //button right
        st = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                st += " ";
            }
            for (int j = 0; j <= i; j++) {
                st += "*";
            }
            st += "\n";
        }
        System.out.println(st);

    }


}
