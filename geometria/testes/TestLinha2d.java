package geometria.testes;

import static org.junit.Assert.*;
import geometria.fontes.Linha2d;

import org.junit.Test;

public class TestLinha2d {

	@Test
	public void testPontosLinha1() {
		Linha2d linha1 = new Linha2d();
		linha1.getX();
		linha1.getY(); 
		assertEquals("nao eh igual", 1, linha1.getX());
		assertEquals("nao eh igual", 4, linha1.getY());

	}

	
}
