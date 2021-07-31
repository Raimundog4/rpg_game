package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BotaTest {

	Bota bota;
	
	@Before
	public void setUp() throws Exception {
		bota = new Bota();
	}

	@Test
	public void testSetGetForca() {
		bota.setForca(10);
		assertEquals(10, bota.getForca());
	}

	@Test
	public void testSetGetAgilidade() {
		bota.setAgilidade(15);
		assertEquals(15, bota.getAgilidade());
	}

	@Test
	public void testSetGetInteligencia() {
		bota.setInteligencia(20);
		assertEquals(20, bota.getInteligencia());
	}

	@Test
	public void testSetGetNomeBota() {
		bota.setNomeBota("Phenix");
		assertEquals("Phenix", bota.getNomeBota());
	}

}
