package com.realestate.suggestion.application.service;

import com.realestate.suggestion.application.port.in.RealEstateFeature;
import com.realestate.suggestion.application.port.out.LoadNearbyLocationPort;
import com.realestate.suggestion.application.port.out.GetMLInferencesPort;
import com.realestate.suggestion.application.port.in.EstimatePriceUseCase;
import com.realestate.suggestion.common.UseCase;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RequiredArgsConstructor
@UseCase
public class EstimatePriceService implements EstimatePriceUseCase {

	private final GetMLInferencesPort getMLInferencesPort;


    @Override
	public BigDecimal getPredictPrice(RealEstateFeature realEstateFeature) {
		return getMLInferencesPort.getMLInference(realEstateFeature);
	}


}




