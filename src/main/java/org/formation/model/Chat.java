package org.formation.model;

public class Chat implements AnimalDomestique {
	
	int vitesse;

	public String crie() {
		return "miaou";
	}

	public Chien meilleurAmi() {
		return new Chien();
	}

	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	

}
