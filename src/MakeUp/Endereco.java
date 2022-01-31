package MakeUp;

public class Endereco {
	
	private String nomeDaRua;
	private String pontoDeReferencia;
	private int numeroDaCasa;
	


	public Endereco (String nomeDaRua, String pontoDeReferencia, int numeroDaCasa) {
		
		this.nomeDaRua = nomeDaRua;
		this.pontoDeReferencia = pontoDeReferencia;
		this.numeroDaCasa = numeroDaCasa;
		
		
	}
	
	public Endereco () {
		this ("","",0);
		
	}



	public String getNomeDaRua() {
		return nomeDaRua;
	}



	public void setNomeDaRua(String nomeDaRua) {
		this.nomeDaRua = nomeDaRua;
	}



	public String getPontoDeReferencia() {
		return pontoDeReferencia;
	}



	public void setPontoDeReferencia(String pontoDeReferencia) {
		this.pontoDeReferencia = pontoDeReferencia;
	}



	public int getNumeroDaCasa() {
		return numeroDaCasa;
	}



	public void setNumeroDaCasa(int numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
}