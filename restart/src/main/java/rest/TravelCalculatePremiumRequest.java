package rest;

import java.util.Date;

public class TravelCalculatePremiumRequest {


    private String personFirstName;
    private String personLastName;
    private Date agreementDateFrom;
    private Date agreementDateTo;

    public TravelCalculatePremiumRequest(final String personFirstName, final String personLastName, final Date agreementDateFrom, final Date agreementDateTo) {
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }

    public TravelCalculatePremiumRequest() {
    }

    public String getPersonFirstName() {
        return this.personFirstName;
    }

    public void setPersonFirstName(final String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return this.personLastName;
    }

    public void setPersonLastName(final String personLastName) {
        this.personLastName = personLastName;
    }

    public Date getAgreementDateFrom() {
        return this.agreementDateFrom;
    }

    public void setAgreementDateFrom(final Date agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
    }

    public Date getAgreementDateTo() {
        return this.agreementDateTo;
    }

    public void setAgreementDateTo(final Date agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
    }
}
