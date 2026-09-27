package com.vacationplanner.mcp.airbnb.service;

import com.vacationplanner.mcp.airbnb.domain.Property;
import lombok.extern.log4j.Log4j2;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;

import java.util.List;
@Log4j2
public class AirbnbService {

    @Tool(name = "propertiesSearch",
            description = "Returns properties that fall within a certain radius from a specified zip or postal code")
    public List<Property> getPropertiesWithinRadiusFromZip(@ToolParam(required = true, description = "zip or postal code at the center of the search radius") final String zip,
                                                           @ToolParam(required = true, description = "The distance in miles from the zip code center where the search should be conducted from.") final double raidusMiles) {
        //Do some real processing here based on API search and distance from zip.
        log.info("Going to search for properties in zip {} with a radius of {}", zip, raidusMiles);
        return List.of(
                new Property("1", "123 Maple Street", 4, 2, 6,
                        List.of("Sofa", "microwave", "fridge", "Iron"), 223.45),
                new Property("2", "123 Spring Street", 3, 3, 4,
                        List.of("Sofa", "microwave",  "Iron"), 332.10),
                new Property("3", "22 Elm Street", 3, 3, 4,
                        List.of("Alarm clock", "TV",  "fridge"), 434.21),
                new Property("4", "91 Locust", 7, 1, 4,
                        List.of("Sofa", "TV",  "fridge"), 229.99),
                new Property("5", "55 Firefly", 6, 2, 12,
                        List.of("Coffee Machine", "TV",  "fridge"), 212.14)
        );
    }


}
