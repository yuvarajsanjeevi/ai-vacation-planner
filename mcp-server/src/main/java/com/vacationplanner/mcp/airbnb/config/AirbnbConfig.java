package com.vacationplanner.mcp.airbnb.config;

import com.vacationplanner.mcp.airbnb.service.AirbnbService;
import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AirbnbConfig {
    @Bean
    public AirbnbService airbnbService()  {
         return new AirbnbService();
    }

    @Bean
    public List<ToolCallback> airbnbTools(AirbnbService airbnbService) {
        return List.of(ToolCallbacks.from(airbnbService));
    }
}
