package com.realestate.suggestion.application.port.out;

import com.realestate.suggestion.domain.RealEstateInfo;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;

@Data
public class Area {

    private  double longitude;
    private double latitude;
    private double radius;

}
