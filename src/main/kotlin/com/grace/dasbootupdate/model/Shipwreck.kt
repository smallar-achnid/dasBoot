package com.grace.dasbootupdate.model;

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Shipwreck {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	var id: Long = 0
	var name: String = ""
	var description: String = ""
	var condition: String = ""
	var depth: Int = 0
	var latitude: Double = 0.0
	var longitude: Double = 0.0
	var yearDiscovered: Int = 0

	constructor() {}

	constructor(id: Long, name: String, description: String, condition: String, depth: Int, latitude: Double, longitude: Double, yearDiscovered: Int) {
		this.id = id
		this.name = name
		this.description = description
		this.condition = condition
		this.depth = depth
		this.latitude = latitude
		this.longitude = longitude
		this.yearDiscovered = yearDiscovered
	}
}

//	fun getId(): Long {
//		return it.id;
//	}
//
//	fun setId(Long id) : void {
//		this.id = id;
//	}
//
//	fun getName(): String  {
//		return name;
//	}
//
//	fun setName(String name): void {
//		this.name = name;
//	}
//
//	fun getDescription(): String {
//		return description;
//	}
//
//	fun setDescription(String description): void {
//		this.description = description;
//	}
//
//	fun String getCondition() {
//		return condition;
//	}
//
//	fun void setCondition(String condition) {
//		this.condition = condition;
//	}
//
//	fun Integer getDepth() {
//		return depth;
//	}
//
//	fun void setDepth(Integer depth) {
//		this.depth = depth;
//	}
//
//	fun Double getLatitude() {
//		return latitude;
//	}
//
//	fun void setLatitude(Double latitude) {
//		this.latitude = latitude;
//	}
//
//	fun Double getLongitude() {
//		return longitude;
//	}
//
//	fun void setLongitude(Double longitude) {
//		this.longitude = longitude;
//	}
//
//	fun Integer getYearDiscovered() {
//		return yearDiscovered;
//	}
//
//	fun void setYearDiscovered(Integer yearDiscovered) {
//		this.yearDiscovered = yearDiscovered;
//	}
//}
