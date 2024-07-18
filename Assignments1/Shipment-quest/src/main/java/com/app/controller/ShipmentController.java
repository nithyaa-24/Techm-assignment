package com.app.controller;

import com.app.model.*;
import com.app.service.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {
	
	@Autowired 
	private ShipmentService shipmentService;
	
//	@RequestMapping("/shipment")
//	public String test() {
//		return "Shipment is started";
//	}
	
	@RequestMapping(method=RequestMethod.POST, value= "/addship")
	public ResponseEntity<Shipment> addShip( @RequestBody Shipment shipment) {
		return ResponseEntity.ok(shipmentService.addShip( shipment));
	}
	
	@RequestMapping(method=RequestMethod.GET, value= "/{trackNo}")
	public ResponseEntity<Shipment> getShip(@PathVariable String trackNo) {
		return ResponseEntity.ok(shipmentService.getShip(trackNo));
	}
	
//	@GetMapping("/all")
//	public List<Shipment> getShips(){
//		return shipmentService.getShips();
//	}
	
	@DeleteMapping("{shipId}")
	public ResponseEntity<String> deleteShip(@PathVariable Long shipId) {
		 shipmentService.deleteShip(shipId);
		 return ResponseEntity.ok("The requested shipId " +shipId + "got deleted");
	}
	
	
	

}
