package com.realestate.suggestion.domain;

import lombok.NonNull;
import java.math.BigDecimal;
import java.util.*;

/**
 * A top of nearest neighbors.
 */
public class NearbyWindow {

	/**
	 * The list of nearby real estate within this window.
	 */
	private List<RealEstateInfo> neighbors;

	/**
	 * Calculates the average price of all nearby real estate within this window.
	 */
	public BigDecimal calculateAveragePrice() {
		BigDecimal averagePrice = neighbors.stream()
				.map(RealEstateInfo::getPrice)
				.reduce(BigDecimal.ZERO, BigDecimal::add)
				.divide(BigDecimal.valueOf(neighbors.size()));

		return averagePrice;
	}

	public NearbyWindow(@NonNull List<RealEstateInfo> neighbors) {
		this.neighbors = neighbors;
	}

	public NearbyWindow(@NonNull RealEstateInfo... realEstateInfos) {
		this.neighbors = new ArrayList<>(Arrays.asList(realEstateInfos));
	}

	public List<RealEstateInfo> getNeighbors() {
		return Collections.unmodifiableList(this.neighbors);
	}

	public void addNeighbors(RealEstateInfo realEstateInfo) {
		this.neighbors.add(realEstateInfo);
	}
}
