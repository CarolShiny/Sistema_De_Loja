package MakeUp;

	
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	
	
	public class ProdutoRemoveController implements ActionListener {


		private Lista lista;
		private JFrame janelaPrincipal;

		public ProdutoRemoveController(Lista lista, JFrame janelaPrincipal) {
			this.lista = lista;
			this.janelaPrincipal = janelaPrincipal;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String codigo = JOptionPane.showInputDialog(janelaPrincipal, 
					"Digite o código do produto a remover a remover ");
			boolean removeu = lista.removeCliente(codigo);
			if (removeu) {
				JOptionPane.showMessageDialog(janelaPrincipal, 
						"Produto removido com sucesso");
			} else {
				JOptionPane.showMessageDialog(janelaPrincipal, 
						"Produto não foi encontrado. Operação não realizada");
			}

		}

}
