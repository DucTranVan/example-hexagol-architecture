package com.realestate.suggestion.adapter.client;

import com.realestate.suggestion.application.port.out.Area;
import com.realestate.suggestion.application.port.out.LoadNearbyLocationPort;
import com.realestate.suggestion.common.RestClientAdapter;
import com.realestate.suggestion.domain.RealEstateArea;
import com.realestate.suggestion.domain.RealEstateInfo;

@RestClientAdapter
public class LoadNearbyClientAdapter implements LoadNearbyLocationPort {
    @Override
    public RealEstateArea loadNearbyLocation(Area area) {
        RealEstateArea realEstateArea = null;
        return realEstateArea;
    }
}
