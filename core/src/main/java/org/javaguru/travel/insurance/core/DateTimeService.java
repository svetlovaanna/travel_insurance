package org.javaguru.travel.insurance.core;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateTimeService {

    BigDecimal calculateDays (Date from, Date to){
        long diff = to.getTime() - from.getTime();
        var daysBetween = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return BigDecimal.valueOf(daysBetween);
    }

}
