package com.excelr.bookmyflights.model;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "passengers")
public class Passenger {
	@Id
	private UUID id;
	private String name;
	private long number;
	private String address;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(UUID id, String name, long number, String address) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.address = address;
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", number='" + getNumber() + "'" +
			", address='" + getAddress() + "'" +
			"}";
	}

}