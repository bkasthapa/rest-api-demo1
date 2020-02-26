package com.rab3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.Dtos.FlightDto;
import com.rab3.Services.FlightServices;

@RestController
@RequestMapping("/flights")
public class FlightController {

	private FlightServices flightServices;

	@GetMapping("")
	public FlightDto getFlightByNumber() {
		return flightServices.getDummyFlight();
	}

	public FlightServices getFlightServices() {
		return flightServices;
	}

	public void setFlightServices(FlightServices flightServices) {
		this.flightServices = flightServices;
	}

	

}
