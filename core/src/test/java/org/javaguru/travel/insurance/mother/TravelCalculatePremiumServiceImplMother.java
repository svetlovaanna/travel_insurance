package org.javaguru.travel.insurance.mother;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;

import java.util.Date;

public class TravelCalculatePremiumServiceImplMother {
    public static TravelCalculatePremiumRequest defailtValue() {
        return TravelCalculatePremiumRequest.builder()
                .personFirstName("Dima")
                .personLastName("Pupkin")
                .agreementDateFrom(new Date())
                .agreementDateTo(new Date())
                .build();
    }
}
