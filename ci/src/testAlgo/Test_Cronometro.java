package testAlgo;

import static org.junit.Assert.*;

import org.junit.Test;

import ci.Cronometro;

public class Test_Cronometro {
	
	Cronometro c = new Cronometro();
	@Test
	public void test() {
	assertEquals("Hola", c.obtener());
	}

}
