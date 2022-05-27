package negocio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest_Ex3 {

	@Test
	public void testAdicionarConta() {
		// criando algumas contas
		ContaCorrente conta01 = new ContaCorrente(1, 700, true);
		ContaCorrente conta02 = new ContaCorrente(2, 1200, true);

		// inserindo as contas criados na lista de contas do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);

		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		List<ContaCorrente> contas = gerContas.getContasDoBanco();
		
		assertEquals(contas.size(), 1);
		assertTrue(contas.contains(conta01));
		
		gerContas.adicionaConta(conta02);
		
		contas =  gerContas.getContasDoBanco();
		
		assertEquals(contas.size(), 2);
		assertTrue(contas.contains(conta02));
	}
}
