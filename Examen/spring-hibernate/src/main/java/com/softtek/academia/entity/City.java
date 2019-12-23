package com.softtek.academia.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cities")
public class City {

	private Long City_id;
	private String Description;
	private String State;

	public Long getCity_id() {
		return City_id;
	}

	public void setCity_id(Long city_id) {
		City_id = city_id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	@Override
	public String toString() {
		return "City [City_id=" + City_id + ", Description=" + Description + ", State=" + State + "]";
	}

}
