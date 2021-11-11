package ru.itsjava.services;

import ru.itsjava.domain.Soap;

public interface SoapService {
    Soap takeSoapByFirm(String firm);
    void putSoap(Soap soap);
    boolean hasSoap(String firm);
    void printSoap();
}
