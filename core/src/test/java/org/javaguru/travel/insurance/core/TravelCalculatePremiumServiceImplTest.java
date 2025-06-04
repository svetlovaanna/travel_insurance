package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TravelCalculatePremiumServiceImplTest {

    private final TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
    @Test
    public void shouldPopulateResponseFirstName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "Vasya", "Pupkin", new Date(), new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }
    @Test
    public void shouldPopulateResponseLastName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "Vasya", "Pupkin", new Date(), new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }
    @Test
    public void shouldPopulateResponseDateFrom() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "Vasya", "Pupkin", new Date(), new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }
    @Test
    public void shouldPopulateResponseDateTo() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "Vasya", "Pupkin", new Date(), new Date());
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }


/*

//TODO разбраться подробнее с фейл статусами
        //        request.setPersonFirstName("aaa");
        assertAll("Проверка всех свойств пользователя",
                () -> assertEquals(response.getPersonFirstName(), request.getPersonFirstName(), "Имя не совпадает"),
                () -> assertEquals(response.getPersonLastName(), request.getPersonLastName(), "Фамилия не совпадает"),
                () -> assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom(), "Дата ОТ не совпадает"),
                () -> assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo(), "Дата ДО не совпадает")
        );
*/
}
