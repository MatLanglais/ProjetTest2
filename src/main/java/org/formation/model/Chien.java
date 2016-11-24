package org.formation.model;

public class Chien implements AnimalDomestique {
	
	int vitesse;

	public String crie() {
		return "wafwaf";
	}
	
	public Chat meilleurAmi(){
		return new Chat();
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
}
