package org.javaguru.travel.insurance.core;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class DateTimeService {

    BigDecimal getDaysBetween (Date from, Date to){
        long diff = to.getTime() - from.getTime();
        var daysBetween = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return BigDecimal.valueOf(daysBetween);
    }

}
