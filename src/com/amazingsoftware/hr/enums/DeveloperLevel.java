package com.amazingsoftware.hr.enums;

import java.io.Serializable;

public enum DeveloperLevel implements Serializable {

	LEVEL1(17),
	LEVEL2(18),
	LEVEL3(19.50);
	
	private final double rate;
	
	DeveloperLevel(double rate) {
		this.rate = rate;
	}

	public double getRate() {
		return rate;
	}
}
