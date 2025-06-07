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



}
