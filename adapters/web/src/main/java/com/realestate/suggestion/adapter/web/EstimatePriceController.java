package com.realestate.suggestion.adapter.web;

import com.realestate.suggestion.application.port.in.EstimatePriceUseCase;
import com.realestate.suggestion.application.port.in.RealEstateFeature;
import com.realestate.suggestion.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;

@WebAdapter
@RestController
@RequestMapping(path = "/suggestion")
@RequiredArgsConstructor
class EstimatePriceController {

	private final EstimatePriceUseCase estimatePriceUseCase;

	@PostMapping(value = "/price/estimate")
	public String estimate(@RequestBody RealEstateFeature realEstateFeature,
						   HttpServletRequest request, HttpServletResponse response) {

		BigDecimal estimatePrice = estimatePriceUseCase.getPredictPrice(realEstateFeature);
		return String.valueOf(estimatePrice);
	}

}
