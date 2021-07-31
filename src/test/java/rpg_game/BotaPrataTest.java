package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaPrataTest {

	@Test
	public void testCriacaoBotaPrata() {
		//MONTAGEM
		BotaPrata botaPrata = new BotaPrata();

		//TESTE
		assertEquals(2, botaPrata.getForca());
		assertEquals(1, botaPrata.getAgilidade());
		assertEquals(1, botaPrata.getInteligencia());
		assertEquals("Bota prata", botaPrata.getNomeBota());
	}

}
