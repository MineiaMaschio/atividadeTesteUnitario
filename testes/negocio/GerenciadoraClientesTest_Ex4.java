package negocio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex4 {

	@Test
	public void testRemoveCliente() {
		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);

		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);

		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);

		List<Cliente> clientes = gerClientes.getClientesDoBanco();

		assertEquals(clientes.size(), 2);
		assertTrue(clientes.contains(cliente01));
		assertTrue(clientes.contains(cliente02));
		
		gerClientes.removeCliente(cliente01.getId());
		
		clientes = gerClientes.getClientesDoBanco();
		assertEquals(clientes.size(), 1);
		assertFalse(clientes.contains(cliente01));
	}
}
