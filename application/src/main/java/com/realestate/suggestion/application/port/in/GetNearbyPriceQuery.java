package com.realestate.suggestion.application.port.in;

import com.realestate.suggestion.application.port.out.Area;
import com.realestate.suggestion.domain.RealEstateArea;

public interface GetNearbyPriceQuery {

	RealEstateArea getNearbyInfo(Area area);

}
