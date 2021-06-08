package com.realestate.suggestion.adapter.client;

import com.realestate.suggestion.application.port.in.RealEstateFeature;
import com.realestate.suggestion.application.port.out.GetMLInferencesPort;
import com.realestate.suggestion.common.RestClientAdapter;

import java.math.BigDecimal;

@RestClientAdapter
public class MLServiceClientAdapter implements GetMLInferencesPort {
    @Override
    public BigDecimal getMLInference(RealEstateFeature features) {
        return BigDecimal.valueOf(10);
    }
}
