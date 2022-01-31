package MakeUp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaLoja implements Lista{

	private Map<String, Cliente> clientes;
	private Map<String, Produto> produtos;
	
	
	public ListaLoja() {
		this.clientes = new HashMap<>();
		this.produtos = new HashMap<String, Produto>();
	}
	
	@Override
	public boolean cadastraCliente (String nome, Endereco endereco, String cpf) throws ClienteJaExisteException {
		if (!clientes.containsKey(cpf)) {
			this.clientes.put(cpf, new Cliente(nome, endereco, cpf));
			return true;
		} else {
			throw new ClienteJaExisteException ("Esse cliente j� foi cadastrado");
		}
	}

	@Override
	public List<Cliente> pesquisaCliente (String cpf)  {
		List<Cliente> clientes = new ArrayList<>();
		for (Cliente c: this.clientes.values()) {
			if (c.getCpf() == cpf ) {
				clientes.add(c);
			}
			else {
				System.out.println("Cliente n�o encontrado");
			}
		}
		return clientes;
	}

	@Override
	public boolean removeCliente(String cpf) {
		Cliente c = this.clientes.remove(cpf);
		if (c == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void setClientes(List<Cliente> clientesCO) {
		for (Cliente c: clientesCO) {
			this.clientes.put(c.getCpf(), c);	
		}
	}

	@Override
	public List<Cliente> getClientes() {
		return (List<Cliente>) this.clientes.values();
	}

	@Override
	public Produto pesquisaProduto(String codigoProduto)throws ProdutoNaoExisteException {
		if (this.produtos.containsKey(codigoProduto)) {
		return this.produtos.get(codigoProduto);
}
		throw new ProdutoNaoExisteException("N�o foi encontrado produto"+" com o c�digo "+codigoProduto);
		}
	
	@Override
	public boolean existeProduto(Produto produto) {
		if (this.produtos.containsKey(produto.getCodigo())){
			return true;
			} else {
				return false;
			}

	}


	@Override
	public boolean cadastraProduto(Produto produto) {
		if (existeProduto(produto)) {
			return false;
			} else {
				this.produtos.put(produto.getCodigo(),produto);
				}
		return true;
}
	
	
	

	public boolean removeProduto(String codigoProduto) {
			Cliente c = this.clientes.remove(codigoProduto);
			if (c == null) {
				return false;
			} else {
				return true;
			}
		}
	


}