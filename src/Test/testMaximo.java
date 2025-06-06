package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.MisArrays;

class testMaximo {

	static float notas[];
	
	@BeforeAll
	static void setup() {
		notas = new float[] {7.5f, 8f, 6.5f, 2f};
	}
	
	@Test
	void test() {
		float resultadoObtenido = MisArrays.maximaNota(notas);
		float resultadoEsperado = 8;
		assertEquals(resultadoObtenido,resultadoEsperado);
	}

}
