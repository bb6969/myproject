package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final int Fee = 30;


    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        System.out.println("Welcome to parking lot !");
        int func = 0;
        while (func != 4) {

            System.out.println("(1) Car entering");
            System.out.println("(2) Car leaving");
            System.out.println("(3) Status");
            System.out.println("(4) Exit");

            Scanner scanner = new Scanner(System.in);//取得使用者輸入的東西
            String s = scanner.nextLine();
            func = Integer.parseInt(s);

            switch (func) {
                case 1:
                    System.out.println("Please enter your car ID");
                    String id = scanner.nextLine();
                    Car car = new Car(id);
                    cars.add(car);
                    System.out.println("Car added");
                    break;
                case 2:
                    for (Car c : cars) {
                        System.out.println(c.id + "/" + c.enter + "/" + c.leave);
                    }
                    break;
            }
        }
    }
}
