package com.rab3.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rab3.Dtos.FlightDto;
import com.rab3.Dtos.PassengerDto;

@Service
public class FlightServices {

	public FlightDto getDummyFlight() {
		FlightDto f = new FlightDto();
		f.setFlightNumber("AA-234");
		f.setSource("IAD");
		f.setDestination("ORD");

		List<PassengerDto> passengers = new ArrayList<PassengerDto>();
		PassengerDto p1 = new PassengerDto();
		p1.setName("Rajesh Hamal");
		p1.setEmailAddress("rhamal@gmail.com");
		p1.setGender("Male");
		p1.setPhoneNo("09879731234");
		p1.setSsn("98742434354");
		p1.setGender("Male");

		PassengerDto p2 = new PassengerDto();
		p2.setName("Katerina kaif");
		p2.setEmailAddress("kkif@gmail.com");
		p2.setGender("Female");
		p2.setPhoneNo("16703356567");
		p2.setSsn("2343400984354");
		p2.setGender("Female");

		passengers.add(p1);
		passengers.add(p2);

		f.setPassengers(passengers);

		return f;
	}

}