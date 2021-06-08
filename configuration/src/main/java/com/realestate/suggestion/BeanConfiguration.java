package com.realestate.suggestion;

import com.realestate.suggestion.adapter.client.LoadNearbyClientAdapter;
import com.realestate.suggestion.adapter.client.MLServiceClientAdapter;
import com.realestate.suggestion.application.port.in.EstimatePriceUseCase;
import com.realestate.suggestion.application.port.in.GetNearbyPriceQuery;
import com.realestate.suggestion.application.port.out.Area;
import com.realestate.suggestion.application.port.out.GetMLInferencesPort;
import com.realestate.suggestion.application.port.out.LoadNearbyLocationPort;
import com.realestate.suggestion.application.service.EstimatePriceService;
import com.realestate.suggestion.application.service.GetNearbySuggestionService;
import com.realestate.suggestion.domain.RealEstateArea;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    GetMLInferencesPort getMLInferencesPort(){
        return  new MLServiceClientAdapter();
    }

    @Bean
    EstimatePriceUseCase estimatePriceUseCase(GetMLInferencesPort getMLInferencesPort){
        return  new EstimatePriceService(getMLInferencesPort);
    }

    @Bean
    LoadNearbyLocationPort loadNearbyLocationPort(){
        return  new LoadNearbyClientAdapter();
    }

    @Bean
    GetNearbyPriceQuery getNearbyPriceQuery(LoadNearbyLocationPort loadNearbyLocationPort){
        return new GetNearbySuggestionService(loadNearbyLocationPort);
    }


}
