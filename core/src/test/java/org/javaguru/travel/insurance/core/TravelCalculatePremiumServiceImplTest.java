package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.mother.TravelCalculatePremiumServiceImplMother;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumRequest request;
    private DateTimeService dateTimeService;
    private TravelCalculatePremiumServiceImpl service;

    @BeforeEach
    void setUp() {
        request = TravelCalculatePremiumServiceImplMother.defailtValue();
        dateTimeService = mock(DateTimeService.class);
        when(dateTimeService.calculateDays(request.getAgreementDateFrom(), request.getAgreementDateTo())).thenReturn(BigDecimal.ZERO);
        service = new TravelCalculatePremiumServiceImpl(dateTimeService);
    }

    @Test
    void shouldPopulateResponseFirstName() {
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        System.out.println(request);
        assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }
    @Test
    void shouldPopulateResponseLastName() {
//        TravelCalculatePremiumRequest request = TravelCalculatePremiumServiceImplMother.defailtValue();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }
    @Test
    void shouldPopulateResponseDateFrom() {
//        TravelCalculatePremiumRequest request = TravelCalculatePremiumServiceImplMother.defailtValue();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }
    @Test
    void shouldPopulateResponseDateTo() {
//        TravelCalculatePremiumRequest request = TravelCalculatePremiumServiceImplMother.defailtValue();
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }
}
