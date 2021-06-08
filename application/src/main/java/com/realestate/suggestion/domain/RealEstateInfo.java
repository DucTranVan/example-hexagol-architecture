package com.realestate.suggestion.domain;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class RealEstateInfo {

	@Getter
	@NonNull
	private RealEstateInfoId id;

	@Getter
	@NonNull
	private Integer numberOfRooms;

	@Getter
	@NonNull
	private  Integer numberOfBedRooms;

	@Getter
	@NonNull
	private Integer areas;

	@Getter
	@NonNull
	private BigDecimal price;

	@Getter
	@NonNull
	private final Location location;

	public RealEstateInfo(
			@NonNull BigDecimal price,
			@NonNull Integer numberOfRooms, @NonNull Integer numberOfBedRooms, @NonNull Integer areas,  @NonNull Location location) {
		this.numberOfRooms = numberOfRooms;
		this.numberOfBedRooms = numberOfBedRooms;
		this.areas = areas;
		this.price = price;
		this.id = null;
		this.location = location;
	}

	@Value
	public static class RealEstateInfoId {
		private final Long value;
	}

}
