package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraContasTest_Ex5 {

	@Test
	public void testContaAtiva() {
		// criando algumas contas
		ContaCorrente conta01 = new ContaCorrente(1, 700, true);
		ContaCorrente conta02 = new ContaCorrente(2, 1200, false);

		// inserindo as contas criados na lista de contas do banco
		List<ContaCorrente> contasDoBanco = new ArrayList<>();
		contasDoBanco.add(conta01);
		contasDoBanco.add(conta02);

		GerenciadoraContas gerContas = new GerenciadoraContas(contasDoBanco);
		
		boolean isAtivoConta1 = gerContas.contaAtiva(conta01.getId());
		boolean isAtivoConta2 = gerContas.contaAtiva(conta02.getId());
		
		assertThat(isAtivoConta1, is(true));
		assertThat(isAtivoConta2, is(false));
	}
}
