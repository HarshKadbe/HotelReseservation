package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Booking;
import com.example.demo.services.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/bookroom")
	public Booking bookroom(@RequestBody Booking booking) {
		return bookingService.bookroom(booking);
	}
	
	@PostMapping("/user/{id}")
	public Booking getBooking(@PathVariable(value = "id") Long id) {
		return bookingService.getBookingsById(id);
	}

}
