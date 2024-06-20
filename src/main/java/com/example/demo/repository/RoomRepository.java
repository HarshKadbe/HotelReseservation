package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Room;
import java.util.List;


public interface RoomRepository extends JpaRepository<Room, Long> {
	List<Room> findByIsavailable(Boolean isavailable);

}
