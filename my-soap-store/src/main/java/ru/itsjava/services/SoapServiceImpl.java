package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Soap;

import java.util.List;

@RequiredArgsConstructor
public class SoapServiceImpl implements SoapService {
    private final List<Soap> soapFromStore;

    @Override
    public Soap takeSoapByFirm(String name) {
        Soap resSoap = null;
        for (Soap soap : soapFromStore) {
            if (soap.getFirm().equals(name)) {
                resSoap = soap;
            }
        }
        if (resSoap != null) {
            soapFromStore.remove(resSoap);
            return resSoap;
        }
        return null;
    }

    @Override
    public void putSoap(Soap soap) {
        soapFromStore.add(soap);
    }

    @Override
    public boolean hasSoap(String name) {
        for (Soap soap: soapFromStore) {
            if (soap.getFirm().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printSoap() {
        for (Soap soap: soapFromStore) {
            System.out.println(soap.getFirm() + " " + soap.getForWhat());
        }
    }
}
