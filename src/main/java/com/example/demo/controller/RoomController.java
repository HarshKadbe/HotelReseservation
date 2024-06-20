package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Room;
import com.example.demo.services.RoomService;

@RestController
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	@PostMapping("/addroom")
	public Room addRoom(@RequestBody Room room) {
		return roomService.addRoom(room);
	}

	@GetMapping("/getavailablerooom")
	public List<Room> getavailableRooms(){
		return roomService.getavailableRooms();
	}
	
}
