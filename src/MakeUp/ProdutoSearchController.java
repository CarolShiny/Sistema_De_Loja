package MakeUp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ProdutoSearchController implements ActionListener {

	private Lista lista;
	private JFrame janelaPrincipal;
	
	public ProdutoSearchController(Lista lista, JFrame janelaPrincipal) {
		this.lista = lista;
		this.janelaPrincipal = janelaPrincipal;
	}
	
	
	public void actionPerformed(ActionEvent e)  {
		String codigo = JOptionPane.showInputDialog(janelaPrincipal,"Informe o código do produto que deseja pesquisar ");
		List<Produto> ListaProdutoPesquisado = new ArrayList <Produto>();
			Produto produto;
			try {
				produto = lista.pesquisaProduto(codigo);
				ListaProdutoPesquisado.add(produto);
			} catch (ProdutoNaoExisteException e1) {
				e1.printStackTrace();
			}
			
			if (ListaProdutoPesquisado.size()!=0) {
				JOptionPane.showMessageDialog(janelaPrincipal, "Produto encontrado:");
				for (Produto p: ListaProdutoPesquisado ) {
					JOptionPane.showMessageDialog(janelaPrincipal, p.toString());
					}
			}else {
				JOptionPane.showMessageDialog(janelaPrincipal, "Não foi encontrado nenhum produto com esse código ");
			}
	}


	
}
