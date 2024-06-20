package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Room;
import com.example.demo.repository.RoomRepository;

@Service
public class RoomService {
	
	@Autowired
	private RoomRepository roomRepository;
	
	public Room addRoom(Room room) {
		return roomRepository.save(room);
	}

	public List<Room> getavailableRooms(){
		return roomRepository.findByIsavailable(true);
	}
	
}
