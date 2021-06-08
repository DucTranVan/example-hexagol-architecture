package com.realestate.suggestion.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.math.BigDecimal;


@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class RealEstateArea {


	@Getter private final RealEstateId id;

	/**
	 * The window of latest activities on this account.
	 */
	@Getter private final NearbyWindow nearbyWindow;

	public BigDecimal estimatePrice() {
		return this.nearbyWindow.calculateAveragePrice();
	}

	@Value
	public static class RealEstateId {
		private Long value;
	}

}
