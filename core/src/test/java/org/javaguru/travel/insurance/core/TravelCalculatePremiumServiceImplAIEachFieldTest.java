package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplAIEachFieldTest {
    private TravelCalculatePremiumServiceImpl service;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @BeforeEach
    void setUp() {
        service = new TravelCalculatePremiumServiceImpl();
    }

    // Вспомогательный метод для создания дат
    private Date parseDate(String dateStr) throws Exception {
        return dateFormat.parse(dateStr);
    }

    // Тесты для каждого свойства отдельно

    @Test
    void shouldReturnCorrectFirstName() throws Exception {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonFirstName("Игорь");

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals("Игорь", response.getPersonFirstName());
    }

    @Test
    void shouldReturnCorrectLastName() throws Exception {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setPersonLastName("Петренко");

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals("Петренко", response.getPersonLastName());
    }

    @Test
    void shouldReturnCorrectDateFrom() throws Exception {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setAgreementDateFrom(parseDate("2025-09-01"));

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(parseDate("2025-09-01"), response.getAgreementDateFrom());
    }

    @Test
    void shouldReturnCorrectDateTo() throws Exception {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
        request.setAgreementDateTo(parseDate("2025-09-15"));

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(parseDate("2025-09-15"), response.getAgreementDateTo());
    }
}