package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArqueiroTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCriacaoArqueiro() {
		Arqueiro arqueiro = new Arqueiro();
		assertEquals(5, arqueiro.getForca());
		assertEquals(10, arqueiro.getAgilidade());
		assertEquals(2, arqueiro.getInteligencia());
	}

	@Test
	public void testLvlUp() {
		fail("Not yet implemented");
	}

}
