package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.w3c.dom.ls.LSOutput;
import ru.itsjava.domain.Client;
import ru.itsjava.domain.Soap;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final SoapService soapService;

    @Override
    public void buySoap() {
        System.out.println("enter soap brand");
        String firm = scanner.next();
        if (soapService.hasSoap(firm)) {
            System.out.println("buying soap...");
            soapService.takeSoapByFirm(firm);
            System.out.println("soap was bought " + firm);
        } else{
            System.out.println("can't buy soap. we have no this soap");
        }

    }

    @Override
    public void putSoap() {
        System.out.println("enter soap brand");
        String firm = scanner.next();

        System.out.println("enter assignment of soap");
        String forWhat = scanner.next();

        Soap soap = new Soap(firm, forWhat);

        soapService.putSoap(soap);
    }

    @Override
    public void printSoap() {
        System.out.println(client.getName() + ", we have: ");
        soapService.printSoap();
    }
}
