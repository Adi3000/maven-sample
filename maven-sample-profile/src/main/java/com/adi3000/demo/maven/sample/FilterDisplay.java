package com.adi3000.demo.maven.sample;

import java.util.ResourceBundle;

public class FilterDisplay {
	private static final String APPLICATION_RESOURCE_NAME = "application";
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(APPLICATION_RESOURCE_NAME);

	public static void main(String[] args) {
		System.out.println(String.format("Bienvenue sur la %s", RESOURCE_BUNDLE.getString("plateform.name")));
		System.out.println(String.format("Vous utilisez une version de java %s", RESOURCE_BUNDLE.getString("plateform.java.version.commment")));
	}
}
