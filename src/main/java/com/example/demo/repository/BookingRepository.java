package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Room;
import com.example.demo.entity.User;

import java.util.List;


public interface BookingRepository extends JpaRepository<Booking, Long>{
	List<Booking> findByUser(User user);
	List<Booking> findByRoom(Room room);

}
