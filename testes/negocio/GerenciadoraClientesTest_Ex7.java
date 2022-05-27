package negocio;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex7 {

	@Test(expected = IdadeNaoPermitidaException.class)
	public void testValidaIdadeMaior65() throws IdadeNaoPermitidaException {
		int idade = 70;

		GerenciadoraClientes gerClientes = new GerenciadoraClientes(null);

		gerClientes.validaIdade(idade);
	}

	@Test(expected = IdadeNaoPermitidaException.class)
	public void testValidaIdadeMenor18() throws IdadeNaoPermitidaException {
		int idade = 10;

		GerenciadoraClientes gerClientes = new GerenciadoraClientes(null);

		gerClientes.validaIdade(idade);
	}

	@Test
	public void testValidaIdade() throws IdadeNaoPermitidaException {
		int idade = 40;

		GerenciadoraClientes gerClientes = new GerenciadoraClientes(null);
		
		boolean isValidaIdade = gerClientes.validaIdade(idade);
		
		assertTrue(isValidaIdade);
	}

}
