package com.company;

import java.util.Scanner;
public class Main {
    public static int dollars = 550;
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int disposableCups = 9;
    public static String action = "0";

    public static String getAction() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static int add() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }



    public static void main(String[] args) {
        while (!action.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining,exit): ");
            action = getAction();
            switch (action) {
                case "fill":
                    System.out.println("Write how many ml of water do you want to add: ");
                    int waterAdd = add();
                    water += waterAdd;
                    System.out.println("Write how many ml of milk do you want to add:  ");
                    int milkAdd = add();
                    milk += milkAdd;
                    System.out.println("Write how many grams of coffee beans do you want to add: ");
                    int beansAdd = add();
                    beans += beansAdd;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cupsAdd = add();
                    disposableCups += cupsAdd;
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                    String buy = getAction();
                    switch (buy) {
                        case "back":
                            break;
                        case "1":
                            if (water >= 250 && beans >= 16 && disposableCups >= 1){
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                beans -= 16;
                                dollars += 4;
                                disposableCups -= 1;
                            }
                            else{
                                if(water < 250) {
                                    System.out.println("Sorry, not enough water!");
                                }
                                if (beans < 16) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                }
                                if (disposableCups < 1) {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                        case "2":
                            if (water >= 350 && beans >= 20 && disposableCups >= 1 && milk >= 75) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                dollars += 7;
                                disposableCups -= 1;
                            }
                            else{
                                if(water < 350) {
                                    System.out.println("Sorry, not enough water!");
                                }
                                if (beans < 20) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                }
                                if (milk < 75) {
                                    System.out.println("Sorry, not enough milk!");
                                }
                                if (disposableCups < 1) {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                        case "3":
                            if (water >= 200 && beans >= 12 && disposableCups >= 1 && milk >= 100) {
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                dollars += 6;
                                disposableCups -= 1;
                            }
                            else{
                                if(water < 200) {
                                    System.out.println("Sorry, not enough water!");
                                }
                                if (beans < 12) {
                                    System.out.println("Sorry, not enough coffee beans!");
                                }
                                if (milk < 100) {
                                    System.out.println("Sorry, not enough milk!");
                                }
                                if (disposableCups < 1) {
                                    System.out.println("Sorry, not enough disposable cups!");
                                }
                            }
                            break;
                    }
                    break;
                case "take":
                    System.out.println("I gave you $ " + dollars);
                    dollars = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(disposableCups + " of disposable cups");
                    System.out.println("$" + dollars + " of money");

            }

        }
    }
}
