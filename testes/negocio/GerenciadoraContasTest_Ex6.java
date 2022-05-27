package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest_Ex6 {

	@Test
	public void testTransfereValor() {
		// criando algumas contas
		ContaCorrente conta01 = new ContaCorrente(1, 700, true);
		ContaCorrente conta02 = new ContaCorrente(2, 1200, true);

		// inserindo as contas criados na lista de contas do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);

		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		boolean isSucesso = gerContas.transfereValor(conta01.getId(), 200, conta02.getId());
	
		assertTrue(isSucesso);
		
		List<ContaCorrente> contas = gerContas.getContasDoBanco();
		assertThat(contas.get(0).getSaldo(), is(500.0));
		assertThat(contas.get(1).getSaldo(), is(1400.0));
	}
}
