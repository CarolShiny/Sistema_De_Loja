package MakeUp;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private Endereco endereco;
	private String cpf;
	
	
	public Cliente (String nome, Endereco endereco, String cpf) {
		
		this.setNome(nome);
		this.setEndereco(endereco);
		this.cpf = cpf;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [nome= " + nome + ", endereco= " + endereco + ", cpf= " + cpf + ", numeroDaCasa= "  +"]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco2) {
		this.endereco = endereco2;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}

	public String getCpf() {
		return cpf;
	}
	

}
