package ru.itsjava.my.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Soap;
import ru.itsjava.services.SoapService;
import ru.itsjava.services.SoapServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class AppTest {
    List<Soap> soapList = new ArrayList<>();

    @DisplayName("должен правильно проверять, есть ли позиция в списке")
    @Test
    public void shouldHaveCorrectMethodHasSoap () {
        Soap soap1 = new Soap("Nivea", "Body");
        Soap soap2 = new Soap("Dove", "Hand");
        soapList.add(soap1);
        soapList.add(soap2);
        SoapService soapService = new SoapServiceImpl(soapList);
        Assertions.assertTrue(soapService.hasSoap("Dove")); //корректно
       // Assertions.assertTrue(soapService.hasSoap("Hulu")); //некорректно
    }

    @DisplayName("должен корректно добавлять позицию в список")
    @Test
    public void shouldHaveCorrectMethodPutSoap(){
        Soap soap1 = new Soap("Nivea", "Body");
        Soap soap2 = new Soap("Dove", "Hand");
        soapList.add(soap1);

        SoapService soapService = new SoapServiceImpl(soapList);
        soapService.putSoap(soap2);

        Assertions.assertEquals(soap2,soapList.get(1)); //корректно
        //Assertions.assertEquals(soap1,soapList.get(1)); //некорректно
    }

    @DisplayName("должен корректно находить позицию по названию и удалять позицию из списка")
    @Test
    public void shouldHaveCorrectMethodTakeSoapByFirm(){
        Soap soap1 = new Soap("Nivea", "Body");
        Soap soap2 = new Soap("Dove", "Hand");
        soapList.add(soap1);
        soapList.add(soap2);

        SoapService soapService = new SoapServiceImpl(soapList);
        soapService.takeSoapByFirm("Hulu");//на несовпадение
        //soapService.takeSoapByFirm("Dove");       //на совпадение

        Assertions.assertNotEquals("Dove", null);// тест на несовпадение
       // Assertions.assertEquals("Dove", "Dove");// на совпадение
        System.out.println(soapList.toString());
    }
}
