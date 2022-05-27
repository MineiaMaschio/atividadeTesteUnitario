package negocio;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex2 {

	@Test
	public void testeGetClientesDoBanco() {
		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);

		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		List<Cliente> listaClientes = gerClientes.getClientesDoBanco();
		
		assertThat(listaClientes, is(clientesDoBanco));
	}
}
