import static org.junit.Assert.*;

import org.junit.Test;


public class Teste {

	@Test
	public void  testSoma() {
		int retorno;
		
		retorno= somaValores.Adicao(2,3);
		assertEquals(" valor esperado : 5, valor retornado:"+retorno,5,retorno);
	}
	
	@Test
	public void CalculaTeste(){
		calculadora calc= new calculadora();
		assertEquals(calc.calculaSoma(12,5), calc.calculaSoma(0,0));
		
		
	}

}