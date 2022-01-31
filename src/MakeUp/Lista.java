package MakeUp;

import java.util.List;

public interface Lista {
	
	public boolean cadastraCliente (String nome, Endereco endereco, String cpf) throws ClienteJaExisteException ;
	public List<Cliente> pesquisaCliente (String cpf) ;
	public boolean removeCliente(String cpf);
	
	public void setClientes (List<Cliente> clientes);
	public  List<Cliente> getClientes();
	
    public boolean existeProduto(Produto produto);
    public Produto pesquisaProduto(String codigoProduto) throws ProdutoNaoExisteException;
	public boolean cadastraProduto(Produto produto);
	public boolean removeProduto(String codigoProduto);
	
	
	

}