package com.realestate.suggestion.application.port.in;

import java.math.BigDecimal;

public interface EstimatePriceUseCase {

	BigDecimal getPredictPrice(RealEstateFeature realEstateFeature);


}
