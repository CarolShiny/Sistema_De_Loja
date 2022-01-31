package MakeUp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ProdutoAddController implements ActionListener{
	
	private Lista lista;
	private JFrame janelaPrincipal;
	
	public ProdutoAddController(Lista lista, JFrame janelaPrincipal){
		this.lista = lista;
		this.janelaPrincipal = janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String codigo = JOptionPane.showInputDialog(janelaPrincipal, "Digite o c�digo do produto: ");
		String descricao = JOptionPane.showInputDialog(janelaPrincipal, "Qual a descri��o do produto? ");
		double precoVenda = Double.parseDouble(JOptionPane.showInputDialog(janelaPrincipal,"Qual o pre�o?"));
		int quantidadeEmEstoque = Integer.parseInt( JOptionPane.showInputDialog(janelaPrincipal,"Quantos t�m em estoques? "));
		
		Produto produto = new Produto (codigo,descricao,precoVenda,quantidadeEmEstoque);
		
		boolean cadastrou = lista.cadastraProduto(produto);
		if(cadastrou) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Produto cadastrado com sucesso!");			
			} else {
				JOptionPane.showMessageDialog(janelaPrincipal, "Produto n�o cadastrado com sucesso. Verifique se o produto j� existia no estoque!");				
			}
		}
}
