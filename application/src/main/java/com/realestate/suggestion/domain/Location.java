package com.realestate.suggestion.domain;

import java.math.BigInteger;

import lombok.NonNull;
import lombok.Value;

@Value
public class Location {

	@NonNull
	private final double longitude;

	@NonNull
	final double latitude;

}



