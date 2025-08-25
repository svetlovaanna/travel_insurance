package org.javaguru.travel.insurance.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder //(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TravelCalculatePremiumRequest {

    private String personFirstName;
    private String personLastName;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date agreementDateFrom;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date agreementDateTo;

}
