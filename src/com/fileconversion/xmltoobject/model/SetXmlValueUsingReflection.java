package com.fileconversion.xmltoobject.model;

import java.lang.reflect.Field;

public class SetXmlValueUsingReflection {

	private String fuelTank;
	private String inventoryDate;
	private String fuelLvl;
	private String fuelVolume;
	private String fuelTemperature;
	private String ullage;
	private String waterLvl;

	public void setValue(String filedName, Object value) {
		try {
			Class<?> obj = this.getClass();
			Field field = obj.getDeclaredField(filedName);
			field.set(this, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getFuelTank() {
		return fuelTank;
	}

	public void setFuelTank(String fuelTank) {
		this.fuelTank = fuelTank;
	}

	public String getInventoryDate() {
		return inventoryDate;
	}

	public void setInventoryDate(String inventoryDate) {
		this.inventoryDate = inventoryDate;
	}

	public String getFuelLvl() {
		return fuelLvl;
	}

	public void setFuelLvl(String fuelLvl) {
		this.fuelLvl = fuelLvl;
	}

	public String getFuelVolume() {
		return fuelVolume;
	}

	public void setFuelVolume(String fuelVolume) {
		this.fuelVolume = fuelVolume;
	}

	public String getFuelTemperature() {
		return fuelTemperature;
	}

	public void setFuelTemperature(String fuelTemperature) {
		this.fuelTemperature = fuelTemperature;
	}

	public String getUllage() {
		return ullage;
	}

	public void setUllage(String ullage) {
		this.ullage = ullage;
	}

	public String getWaterLvl() {
		return waterLvl;
	}

	public void setWaterLvl(String waterLvl) {
		this.waterLvl = waterLvl;
	}

	@Override
	public String toString() {
		return "SetXmlValueUsingReflection [fuelTank=" + fuelTank + ", inventoryDate=" + inventoryDate + ", fuelLvl="
				+ fuelLvl + ", fuelVolume=" + fuelVolume + ", fuelTemperature=" + fuelTemperature + ", ullage=" + ullage
				+ ", waterLvl=" + waterLvl + "]";
	}

}
