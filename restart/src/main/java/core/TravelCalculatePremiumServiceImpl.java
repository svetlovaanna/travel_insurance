package core;

import rest.TravelCalculatePremiumRequest;
import rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        return new TravelCalculatePremiumResponse();
    }

}
