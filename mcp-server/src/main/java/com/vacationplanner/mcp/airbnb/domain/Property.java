package com.vacationplanner.mcp.airbnb.domain;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

import java.util.List;

public record Property(@JsonPropertyDescription("The Id of the property") String id,
                       @JsonPropertyDescription("The address of the property") String address,
                       @JsonPropertyDescription("The number of bedrooms in the property") int numberBedrooms,
                       @JsonPropertyDescription("The number of bathrooms in the property") int numberBathrooms,
                       @JsonPropertyDescription("The number of adults and children that it can house") int capacity,
                       @JsonPropertyDescription("The ameneties in the room or property") List<String> amenetiesList,
                       @JsonPropertyDescription("The rent per day of stay in USD") double rentPerNight) {
}
