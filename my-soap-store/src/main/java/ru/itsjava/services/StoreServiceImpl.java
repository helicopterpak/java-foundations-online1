package ru.itsjava.services;

import ru.itsjava.domain.Client;
import ru.itsjava.domain.Soap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService{
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Soap> soapList = new ArrayList<>();
        soapList.add(new Soap("Tony_Brow", "Eyebrow"));
        soapList.add(new Soap("Dove", "Hand"));
        SoapService soapService = new SoapServiceImpl(soapList);
        ClientService clientService =
                new ClientServiceImpl(client, scanner, soapService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();


    }
}
