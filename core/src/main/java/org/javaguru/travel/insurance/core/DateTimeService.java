package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

public class DateTimeService {

    private BigDecimal calculateDays (TravelCalculatePremiumRequest request){
        long diff = request.getAgreementDateTo().getTime() - request.getAgreementDateFrom().getTime();
        var daysBetween = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return BigDecimal.valueOf(daysBetween);
    }

}
