package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex5 {

	@Test
	public void testClienteAtivo() {
		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, false);

		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);

		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		boolean isAtivoCliente1 = gerClientes.clienteAtivo(cliente01.getId());
		boolean isAtivoCliente2 = gerClientes.clienteAtivo(cliente02.getId());
		
		assertThat(isAtivoCliente1, is(true));
		assertThat(isAtivoCliente2, is(false));
	}
}
