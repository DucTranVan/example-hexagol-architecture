package com.realestate.suggestion.adapter.web;

import com.realestate.suggestion.application.port.in.GetNearbyPriceQuery;
import com.realestate.suggestion.application.port.out.Area;
import com.realestate.suggestion.common.WebAdapter;
import com.realestate.suggestion.domain.RealEstateArea;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebAdapter
@RestController
@RequestMapping(path = "/suggestion")
@RequiredArgsConstructor
class NearbyPriceController {

	private final GetNearbyPriceQuery getNearbyPriceQuery;

	@PostMapping(value = "/price/nearby")
	public RealEstateArea nearbyQuery(@RequestBody Area area,
									  HttpServletRequest request, HttpServletResponse response) {

		RealEstateArea realEstateArea = getNearbyPriceQuery.getNearbyInfo(area);
		return realEstateArea;
	}

}
