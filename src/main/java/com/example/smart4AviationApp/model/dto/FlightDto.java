package com.example.smart4AviationApp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlightDto {
    @Min(1000)
    @Max(9999)
    private int flightNumber;
    @Size(min =3, max = 3)
    @NotBlank
    private String departureAirportIATACode;
    @Size(min =3, max = 3)
    @NotBlank
    private String arrivalAirportIATACode;
    @NotNull
    private Timestamp departureDate;
}
