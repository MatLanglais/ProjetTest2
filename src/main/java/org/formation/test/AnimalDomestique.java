package org.formation.test;

import org.formation.model.Chat;
import org.formation.model.Chien;
import org.formation.service.CourseDAnimaux;
import org.junit.Assert;
import org.junit.Test;

public class AnimalDomestique {

	@Test
	public void chatMiaule() {
		Chat chat = new Chat();
		Assert.assertTrue("miaou".equals(chat.crie()));
	}

	@Test
	public void chienAboie() {
		Chien chien = new Chien();
		Assert.assertTrue("wafwaf".equals(chien.crie()));
	}

	@Test
	public void chienDoitEtreLeMeilleurAmiDuChat() {
		Chien chien = new Chien();
		Chat chat = new Chat();
		Assert.assertEquals(chien.getClass(), chat.meilleurAmi().getClass());
	}
	
	@Test
	public void chatDoitEtreLeMeilleurAmiDuChien() {
		Chien chien = new Chien();
		Chat chat = new Chat();
		Assert.assertEquals(chat.getClass(), chien.meilleurAmi().getClass());
	}
	
	@Test
	public void chien_Gagne_Si_Plus_Rapide_Que_Chat(){
		Chat chat = new Chat();
		Chien chien = new Chien();
		CourseDAnimaux crs = new CourseDAnimaux();
		chat.setVitesse(10);
		chien.setVitesse(100);
		Assert.assertEquals(chien.getClass(), crs.lancerCourse(chat, chien));
	}
	
	@Test
	public void chat_Gagne_Si_Plus_Rapide_Que_Chien(){
		Chat chat = new Chat();
		Chien chien = new Chien();
		CourseDAnimaux crs = new CourseDAnimaux();
		chat.setVitesse(100);
		chien.setVitesse(10);
		Assert.assertEquals(chat.getClass(), crs.lancerCourse(chat, chien));
	}

}
