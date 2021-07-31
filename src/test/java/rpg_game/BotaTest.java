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
		//MONTAGEM
		bota.setForca(10);
		
		//TESTE
		assertEquals(10, bota.getForca());
	}

	@Test
	public void testSetGetAgilidade() {
		//MONTAGEM
		bota.setAgilidade(15);
		
		//TESTE
		assertEquals(15, bota.getAgilidade());
	}

	@Test
	public void testSetGetInteligencia() {
		//MONTAGEM
		bota.setInteligencia(20);
		
		//TESTE
		assertEquals(20, bota.getInteligencia());
	}

	@Test
	public void testSetGetNomeBota() {
		//MONTAGEM
		bota.setNomeBota("Ouro");
		
		//TESTE
		assertEquals("Ouro", bota.getNomeBota());
	}

}
