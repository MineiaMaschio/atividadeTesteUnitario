package negocio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest_Ex4 {

	@Test
	public void testRemoveConta() {
		// criando algumas contas
		ContaCorrente conta01 = new ContaCorrente(1, 700, true);
		ContaCorrente conta02 = new ContaCorrente(2, 1200, true);

		// inserindo as contas criados na lista de contas do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);

		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		List<ContaCorrente> contas = gerContas.getContasDoBanco();

		assertEquals(contas.size(), 2);
		assertTrue(contas.contains(conta01));
		assertTrue(contas.contains(conta02));
		
		gerContas.removeConta(conta01.getId());
		
		contas = gerContas.getContasDoBanco();
		assertEquals(contas.size(), 1);
		assertFalse(contas.contains(conta01));
	}
}
