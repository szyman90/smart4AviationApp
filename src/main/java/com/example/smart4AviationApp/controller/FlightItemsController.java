package com.example.smart4AviationApp.controller;

import com.example.smart4AviationApp.model.dto.FlightItemsDto;
import com.example.smart4AviationApp.service.FlightItemsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class FlightItemsController {
    private final FlightItemsService flightItemsService;
    private static final Logger logger = LoggerFactory.getLogger(FlightController.class);

    public FlightItemsController(FlightItemsService flightItemsService) {
        this.flightItemsService = flightItemsService;
    }

    @PostMapping("/items")
    ResponseEntity<?> createFlightItemsForFlight(@Valid @RequestBody FlightItemsDto toCreateDto) {
        logger.info("create new flight items");
        return flightItemsService.createNewFlightItems(toCreateDto);
    }
}
