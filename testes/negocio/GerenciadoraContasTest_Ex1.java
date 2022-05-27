package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest_Ex1 {

	@Test
	public void testGetContasDoBanco() {
		// criando algumas contas
		ContaCorrente conta01 = new ContaCorrente(1, 700, true);
		ContaCorrente conta02 = new ContaCorrente(2, 1200, true);

		// inserindo as contas criados na lista de contas do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);

		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);

		List<ContaCorrente> listaContas = gerContas.getContasDoBanco();

		assertThat(contasDoBanco, is(listaContas));
	}
}
