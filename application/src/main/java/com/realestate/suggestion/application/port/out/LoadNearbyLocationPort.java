package com.realestate.suggestion.application.port.out;

import com.realestate.suggestion.domain.RealEstateArea;

public interface LoadNearbyLocationPort {

	RealEstateArea loadNearbyLocation(Area area);
}
