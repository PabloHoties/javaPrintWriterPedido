package controllers;

import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Cliente;
import entities.Pagamento;
import entities.Pedido;
import repositories.PedidoRepositoryAbstract;
import repositories.PedidoRepositoryAbstractTxt;
import repositories.PedidoRepositoryAbstractXml;

public class PedidoController {

	public void obterDados() throws Exception {

		Pedido pedido = new Pedido();

		JOptionPane.showMessageDialog(null, "CADASTRO DE PEDIDO:");

		// Pedido
		pedido.setId(UUID.randomUUID());
		pedido.setValor(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do pedido:")));

		// Cliente
		Cliente cliente = new Cliente();
		cliente.setId(UUID.randomUUID());
		cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente:"));
		cliente.setCpf(JOptionPane.showInputDialog("Informe o CPF do cliente:"));
		pedido.setCliente(cliente);

		// Pagamento
		Pagamento pagamento = new Pagamento();
		pagamento.setId(UUID.randomUUID());
		pagamento.setNumeroCartao(JOptionPane.showInputDialog("Insira o número do cartão:"));
		pagamento.setParcelas(Integer.parseInt(JOptionPane.showInputDialog("Insira o número de parcelas:")));
		pedido.setPagamento(pagamento);

		String tipo = JOptionPane.showInputDialog("Insira (1) para TXT ou (2) para XML:");
		PedidoRepositoryAbstract pedidoRepositoryAbstract = null;

		switch (tipo) {
		case "1":
			pedidoRepositoryAbstract = new PedidoRepositoryAbstractTxt();
			break;
		case "2":
			pedidoRepositoryAbstract = new PedidoRepositoryAbstractXml();
			break;
		}

		pedidoRepositoryAbstract.cadastrar(pedido);
	}
}
