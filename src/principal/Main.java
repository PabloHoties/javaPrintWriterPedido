package principal;

import javax.swing.JOptionPane;

import controllers.PedidoController;

public class Main {

	public static void main(String[] args) {

		try {
			PedidoController pedidoController = new PedidoController();
			pedidoController.obterDados();

			JOptionPane.showMessageDialog(null, "PEDIDO CADASTRADO COM SUCESSO.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO: " + e.getMessage());
		}
	}
}
