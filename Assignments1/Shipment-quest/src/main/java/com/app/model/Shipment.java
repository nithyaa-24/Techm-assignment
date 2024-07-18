package com.app.model;

import jakarta.persistence.*;
@Entity
public class Shipment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long shipId;
	private String trackNo;
	private String origin;
	private String destination;
	private String status;
	
	public Long getShipId() {
		return shipId;
	}
	
	public void setShipId(Long shipId) {
		this.shipId = shipId;
	}
	
	public String getTrackNo() {
		return trackNo;
	}
	
	public void setTrackNo(String trackNo) {
		this.trackNo = trackNo;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	



}
