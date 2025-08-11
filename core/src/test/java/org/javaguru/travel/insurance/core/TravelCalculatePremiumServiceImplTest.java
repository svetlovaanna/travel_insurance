package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.core.TravelCalculatePremiumServiceImpl;
import org.javaguru.travel.insurance.mother.TravelCalculatePremiumServiceImplMother;
import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class TravelCalculatePremiumServiceImplTest {

    private TravelCalculatePremiumRequest request;
    @Mock private DateTimeService dateTimeService;
    @Mock private TravelCalculatePremiumRequestValidator requestValidator;

    @InjectMocks
    private TravelCalculatePremiumServiceImpl service;

    @BeforeEach
    void setUp() {
        request = TravelCalculatePremiumServiceImplMother.defailtValue();
        when(dateTimeService.getDaysBetween(request.getAgreementDateFrom(), request.getAgreementDateTo())).thenReturn(BigDecimal.ZERO);
        when(requestValidator.validate(request)).thenReturn(List.of());
        //service = new TravelCalculatePremiumServiceImpl(dateTimeService);
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
