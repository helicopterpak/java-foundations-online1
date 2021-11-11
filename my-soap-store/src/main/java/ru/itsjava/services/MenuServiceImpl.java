package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService{

    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        while (true) {
            printMenu();
            System.out.println("enter menu number");
            int menuNum = scanner.nextInt();

            if (menuNum == 1) {
                System.out.println("you choose buy soap");
                clientService.buySoap();
            } else if (menuNum ==2) {
                System.out.println("you choose put soap");
                clientService.putSoap();
            } else if (menuNum ==3) {
                System.out.println("printing brands");
                clientService.printSoap();
            } else {
                System.out.println("good bye");
                break;
            }
        }
    }

    @Override
    public void printMenu() {
        System.out.println("1 - buy; 2 - give; 3 - print");
    }


}
