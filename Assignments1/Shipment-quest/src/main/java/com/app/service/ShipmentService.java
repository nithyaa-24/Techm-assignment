package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.app.model.Shipment;
import com.app.repository.ShipmentRepository;

import java.util.List;

@Service
public class ShipmentService {
	
	@Autowired
	private ShipmentRepository shipmentRepository;
	
	public Shipment addShip(Shipment shipment) {
		return shipmentRepository.save(shipment);
	}
	
	public Shipment getShip(String trackNo) {
		Shipment shipme=shipmentRepository.findByTrackNo(trackNo);
		return shipme;
	}
	
//	public List<Shipment> getShips(){
//		shipmentRepository.findAll();
//	}
	
	public void deleteShip(Long shipId) {
		 shipmentRepository.deleteById(shipId);
	}
	
}
