package org.javaguru.travel.insurance.rest;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;

import java.util.Date;

public class TravelCalculatePremiumRequestBuilder {
    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;

    public TravelCalculatePremiumRequestBuilder setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
        return this;
    }

    public TravelCalculatePremiumRequestBuilder setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
        return this;
    }

    public TravelCalculatePremiumRequestBuilder setAgreementDateFrom(Date agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
        return this;
    }

    public TravelCalculatePremiumRequestBuilder setAgreementDateTo(Date agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
        return this;
    }

    public TravelCalculatePremiumRequest createTravelCalculatePremiumRequest() {
        return new TravelCalculatePremiumRequest(personFirstName, personLastName, agreementDateFrom, agreementDateTo);
    }
}