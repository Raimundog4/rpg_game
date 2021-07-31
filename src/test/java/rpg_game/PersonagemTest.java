package rpg_game;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonagemTest {

	
	Personagem personagem;
	Bota bota;
	
	@Before
	public void setUp() throws Exception {
		personagem = new Personagem();
		bota = new Bota();
	}

	@Test
	public void testSetGetAgilidadeSemBota() {
		//MONTAGEM
		personagem.setAgilidade(10);
		
		//TESTE
		assertEquals(10, personagem.getAgilidade());
	}
	
	@Test
	public void testSetGetAgilidadeComBota() {
		//MONTAGEM
		personagem.setAgilidade(10);
		bota.setAgilidade(10);
		
		//TESTE
		assertEquals(10, personagem.getAgilidade());
		// Como não há implementação da classe Bota no construtor do método, seu valor sempre será 'Null'
	}

	@Test
	public void testSetGetForcaSemBota() {
		personagem.setForca(10);

		assertEquals(10, personagem.getForca());
	}

	@Test
	public void testSetGetForcaComBota() {
		personagem.setForca(10);
		bota.setForca(20);
		
		assertEquals(10, personagem.getForca());
	}

	@Test
	public void testGetInteligenciaSemBota() {
		personagem.setInteligencia(10);
		
		assertEquals(10, personagem.getInteligencia());
	}

	@Test
	public void testSetInteligenciaComBota() {
		personagem.setInteligencia(10);
		bota.setInteligencia(10);
		
		assertEquals(10, personagem.getInteligencia());
	}
	

	@Test
	public void testSetGetHpSemBota() {
		personagem.setHp(50);
		personagem.setForca(10);
		
		assertEquals(1000, personagem.getHp());
		// O metodo setHp está recebendo um inteiro, mas o getHp está modificando o setHp não está usando esse valor
		// É preciso passa um valor para 'forca' para que o método não retorne 0
	}
	
	@Test
	public void testSetGetHpComBota() {
		personagem.setHp(50);
		personagem.setForca(10);
		bota.setForca(10);

		assertEquals(1000, personagem.getHp());
	}

	@Test
	public void testSetGetManaSemBota() {
		personagem.setMana(50);
		personagem.setInteligencia(10);
		
		assertEquals(1000, personagem.getMana());		
		// O metodo setMana está recebendo um inteiro, mas o getMana está modificando o setHp não está usando esse valor
		// É preciso passa um valor para 'inteligencia' para que o método não retorne 0
	}
	
	@Test
	public void testSetGetManaComBota() {
		personagem.setMana(50);
		personagem.setInteligencia(10);
		bota.setInteligencia(10);
		
		assertEquals(1000, personagem.getMana());		
	}

	@Test
	public void testSetGetLevel() {
		personagem.setLevel(10);
		
		assertEquals(10, personagem.getLevel());
	}

	@Test
	public void testEquiparBota() {
		bota.setForca(2);
	    bota.setAgilidade(1);
	    bota.setInteligencia(1);
	    bota.setNomeBota("Bota prata");
	    personagem.EquiparBota(bota);
//	    assertTrue(bota, personagem.EquiparBota(bota));
	}

	@Test
	public void testExibirDadosInicialJogador() {
		personagem.setLevel(1);
		personagem.setHp(20);
		personagem.setMana(20);
		personagem.setAgilidade(2);
		personagem.setForca(20);
		personagem.setInteligencia(4);
		personagem.exibirDadosInicialJogador();
		assertEquals(1, personagem.getLevel());
		assertEquals(2000, personagem.getHp());
		assertEquals(400, personagem.getMana());
		assertEquals(2, personagem.getAgilidade());
		assertEquals(20, personagem.getForca());
		assertEquals(4, personagem.getInteligencia());
	}

	@Test
	public void testExibirNovosDadosJogador() {
		personagem.setLevel(10);
		personagem.setHp(200);
		personagem.setMana(200);
		personagem.setAgilidade(12);
		personagem.setForca(70);
		personagem.setInteligencia(30);
		personagem.exibirNovosDadosJogador();
		assertEquals(10, personagem.getLevel());
		assertEquals(7000, personagem.getHp());
		assertEquals(3000, personagem.getMana());
		assertEquals(12, personagem.getAgilidade());
		assertEquals(70, personagem.getForca());
		assertEquals(30, personagem.getInteligencia());
	}

}
