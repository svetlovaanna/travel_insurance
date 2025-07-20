package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequestBuilder;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.text.SimpleDateFormat;

class TravelCalculatePremiumServiceImplAIOneTest {
    private TravelCalculatePremiumServiceImpl service;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @BeforeEach
    void setUp() {
        DateTimeService dateTimeService = new DateTimeService();
        service = new TravelCalculatePremiumServiceImpl(dateTimeService);
    }

    // Вспомогательный метод для создания дат
    private Date parseDate(String dateStr) throws Exception {
        return dateFormat.parse(dateStr);
    }

    // Общий тест всех свойств
    @Test
    void calculatePremium_ShouldReturnAllProperties() throws Exception {
        // Подготовка
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequestBuilder().createTravelCalculatePremiumRequest();
        request.setPersonFirstName("Анна");
        request.setPersonLastName("Светлова");
        request.setAgreementDateFrom(parseDate("2025-08-10"));
        request.setAgreementDateTo(parseDate("2025-08-20"));

        // Действие
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Проверка
        assertAll(
                () -> assertEquals("Анна", response.getPersonFirstName(),
                        "Имя не должно быть 'Anna'. Актуальное значение: " + response.getPersonFirstName()),
                () -> assertEquals("Светлова", response.getPersonLastName()),
                () -> assertEquals(parseDate("2025-08-10"), response.getAgreementDateFrom()),
                () -> assertEquals(parseDate("2025-08-20"), response.getAgreementDateTo())
        );
    }


}