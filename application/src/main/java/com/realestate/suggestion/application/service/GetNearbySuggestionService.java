package com.realestate.suggestion.application.service;

import com.realestate.suggestion.application.port.in.GetNearbyPriceQuery;
import com.realestate.suggestion.application.port.out.Area;
import com.realestate.suggestion.application.port.out.LoadNearbyLocationPort;
import com.realestate.suggestion.common.Query;
import com.realestate.suggestion.domain.RealEstateArea;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Query
public class GetNearbySuggestionService implements GetNearbyPriceQuery {

	private final LoadNearbyLocationPort loadNearbyLocationPort;

	@Override
	public RealEstateArea getNearbyInfo(Area area) {
		return loadNearbyLocationPort.loadNearbyLocation(area);

	}
}
