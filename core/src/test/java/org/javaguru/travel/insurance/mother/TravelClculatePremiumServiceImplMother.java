package org.javaguru.travel.insurance.mother;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;

import java.util.Date;

public class TravelClculatePremiumServiceImplMother {
    public static TravelCalculatePremiumRequest valid() {
        return TravelCalculatePremiumRequest.builder()
                .personFirstName("Dima")
                .personLastName("Pupkin")
                .agreementDateFrom(new Date())
                .agreementDateTo(new Date())
                .build();
    }
}
