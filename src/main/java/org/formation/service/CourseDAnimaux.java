package org.formation.service;

import org.formation.model.Chat;
import org.formation.model.Chien;

public class CourseDAnimaux {

	private Chat chat = new Chat();
	private Chien chien = new Chien();

	public Class lancerCourse(Chat chat, Chien chien) {

		if (chat.getVitesse() > chien.getVitesse()) {
			return chat.getClass();
		} else {
			return chien.getClass();
		}

	}
}
