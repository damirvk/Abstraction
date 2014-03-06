package com.damirvk;

public class Main {
	
	public static void getGlasanje(GlasanjeZivotinje glas) {
		
		 System.out.println(glas.getGlas());
	}

	public static void main(String[] args) {

		Krava krava = new Krava();
		Pas pas = new Pas();
		getGlasanje(krava);
		getGlasanje(pas);
		
		
	}

}
