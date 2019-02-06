package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum PackageInstallSecurityType {


  
	/**
	 * Enumeration  : Full
	 */
	Full("Full"),

  
	/**
	 * Enumeration  : None
	 */
	None("None"),

  
	/**
	 * Enumeration  : Custom
	 */
	Custom("Custom"),

  
	/**
	 * Enumeration  : Push
	 */
	Push("Push"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (PackageInstallSecurityType e : EnumSet.allOf(PackageInstallSecurityType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private PackageInstallSecurityType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}