package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Booking;
import com.example.demo.repository.BookingRepository;

@Service
public class BookingService {
	
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public Booking bookroom(Booking booking) {
		return bookingRepository.save(booking);
	}
	
    public Booking getBookingsById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }
	
}

