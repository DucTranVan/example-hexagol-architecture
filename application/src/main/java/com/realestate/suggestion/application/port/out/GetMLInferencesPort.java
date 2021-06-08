package com.realestate.suggestion.application.port.out;

import com.realestate.suggestion.application.port.in.EstimatePriceUseCase;
import com.realestate.suggestion.application.port.in.RealEstateFeature;

import java.math.BigDecimal;

public interface GetMLInferencesPort {

	BigDecimal getMLInference(RealEstateFeature realEstateFeature);

}
