package org.javaguru.travel.insurance.rest;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.text.ParseException;

@Getter @Setter
public class TravelCalculatePremiumRequest {

    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;

    public TravelCalculatePremiumRequest() {
    }

    public TravelCalculatePremiumRequest(String personFirstName, String personLastName,
                                         Date agreementDateFrom, Date agreementDateTo) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }


}
