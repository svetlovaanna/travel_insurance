package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequestBuilder;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplAIEachFieldTest {
    private TravelCalculatePremiumServiceImpl service;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    // TODO разбраться с неработающими тестами с таким конструктором и NULL

    @BeforeEach
    void setUp() {
        DateTimeService dateTimeService = new DateTimeService();
        service = new TravelCalculatePremiumServiceImpl(dateTimeService);
    }

    // Вспомогательный метод для создания дат
    private Date parseDate(String dateStr) throws Exception {
        if (dateStr == null || dateStr.trim().isEmpty()) {
            return new Date(); // null + пустые строки → текущая дата
        }
        try {
            return dateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new Exception("Ошибка парсинга даты: " + dateStr, e);
        }
    }
    // Тесты для каждого свойства отдельно
    @Disabled("This test is disabled for now")
    @Test
    void shouldReturnCorrectFirstName() throws Exception {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequestBuilder().createTravelCalculatePremiumRequest();
        request.setPersonFirstName("Игорь");

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals("Игорь", response.getPersonFirstName());
    }
    @Disabled("This test is disabled for now")
    @Test
    void shouldReturnCorrectLastName() throws Exception {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequestBuilder().createTravelCalculatePremiumRequest();
        request.setPersonLastName("Петренко");

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals("Петренко", response.getPersonLastName());
    }
    @Disabled("This test is disabled for now")
    @Test
    void shouldReturnCorrectDateFrom() throws Exception {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequestBuilder().createTravelCalculatePremiumRequest();
        request.setAgreementDateFrom(parseDate("2025-09-01"));

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(parseDate("2025-09-01"), response.getAgreementDateFrom());
    }
    @Disabled("This test is disabled for now")
    @Test
    void shouldReturnCorrectDateTo() throws Exception {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequestBuilder().createTravelCalculatePremiumRequest();
        request.setAgreementDateTo(parseDate("2025-09-15"));

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(parseDate("2025-09-15"), response.getAgreementDateTo());
    }
}