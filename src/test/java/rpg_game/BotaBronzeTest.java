package rpg_game;

import static org.junit.Assert.*;

import org.junit.Test;

public class BotaBronzeTest {

	@Test
	public void testCriacaoBotaBronze() {
		//MONTAGEM
		BotaBronze botaBronze = new BotaBronze();
		
		//TESTE
		assertEquals(1, botaBronze.getForca());
		
		assertEquals("Bota bronze", botaBronze.getNomeBota());
		//Os testes foram bem sucecidos
	}

	

}
