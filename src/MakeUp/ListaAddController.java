package MakeUp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ListaAddController implements ActionListener {

	private Lista lista;
	private JFrame janelaPrincipal;
	
	public ListaAddController(Lista lista, JFrame janelaPrincipal) {
		this.lista = lista;
		this.janelaPrincipal = janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome do cliente?");
		String rua = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome da rua" );
		String referencia = JOptionPane.showInputDialog(janelaPrincipal,"informe um ponto de referência?" );
		int numero = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"Qual o número da casa " ));
		Endereco endereco = new Endereco(rua, referencia, numero);
    	String cpf = JOptionPane.showInputDialog(janelaPrincipal, "Digite o cpf");
		boolean cadastrou = false;
		try {
			cadastrou = lista.cadastraCliente(nome, endereco, cpf);
		} catch (ClienteJaExisteException e) {
			e.printStackTrace();
		}
		if (cadastrou) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Cliente cadastrado");
		} else {
			JOptionPane.showMessageDialog(janelaPrincipal, "O cliente não foi cadastrado. Verifique se já existia alguém com esse nome");
		}
		
	}

	

}
