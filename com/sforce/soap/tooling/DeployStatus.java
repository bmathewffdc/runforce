package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum DeployStatus {


  
	/**
	 * Enumeration  : Pending
	 */
	Pending("Pending"),

  
	/**
	 * Enumeration  : InProgress
	 */
	InProgress("InProgress"),

  
	/**
	 * Enumeration  : Succeeded
	 */
	Succeeded("Succeeded"),

  
	/**
	 * Enumeration  : SucceededPartial
	 */
	SucceededPartial("SucceededPartial"),

  
	/**
	 * Enumeration  : Failed
	 */
	Failed("Failed"),

  
	/**
	 * Enumeration  : Canceling
	 */
	Canceling("Canceling"),

  
	/**
	 * Enumeration  : Canceled
	 */
	Canceled("Canceled"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (DeployStatus e : EnumSet.allOf(DeployStatus.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private DeployStatus(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}