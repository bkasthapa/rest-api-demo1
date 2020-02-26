package com.rab3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.Dtos.PassengerDto;

@RestController
@RequestMapping("/passenger")

public class PassengerController {

	@GetMapping(value = "")
	public PassengerDto getDummyPassenger() {

		PassengerDto dto = new PassengerDto();
		dto.setName("Bikash Thapa");
		dto.setAddress("Rocky Mount, NC");
		dto.setPhoneNo("2425368490");
		dto.setEmailAddress("bt217859@gmail.com");
		dto.setSsn("123456893");
		dto.setGender("Male");

		return dto;

	}

	@PostMapping(value = "")
	public void createPassenger(@RequestBody PassengerDto dto) {
		System.out.println(dto.toString());
	}

}
