package org.javaguru.travel.insurance.rest;

import java.math.BigDecimal;
import java.util.Date;

public class TravelCalculatePremiumResponse {

    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;
    private BigDecimal agreementPrice;

    public TravelCalculatePremiumResponse(String personFirstName, String personLastName,
                                          Date agreementDateFrom, Date agreementDateTo) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public Date getAgreementDateFrom() {
        return agreementDateFrom;
    }

    public Date getAgreementDateTo() {
        return agreementDateTo;
    }
}
