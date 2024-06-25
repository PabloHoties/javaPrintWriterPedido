package repositories;

import java.io.PrintWriter;

import entities.Pedido;

public class PedidoRepositoryAbstractTxt extends PedidoRepositoryAbstract {

	@Override
	public void cadastrar(Pedido pedido) throws Exception {

		PrintWriter printWriter = new PrintWriter("pedido_" + pedido.getId() + ".txt");

		printWriter.write("ID do pedido: " + pedido.getId());
		printWriter.write("\nValor: " + pedido.getValor() + "\n");

		printWriter.write("\nID do cliente: " + pedido.getCliente().getId());
		printWriter.write("\nNome: " + pedido.getCliente().getNome());
		printWriter.write("\nCPF: " + pedido.getCliente().getCpf() + "\n");

		printWriter.write("\nID do pagamento: " + pedido.getPagamento().getId());
		printWriter.write("\nNúmero do cartão de crédito: " + pedido.getPagamento().getNumeroCartao());
		printWriter.write("\nNúmero de parcelas: " + pedido.getPagamento().getParcelas());

		printWriter.flush();
		printWriter.close();

	}

}
