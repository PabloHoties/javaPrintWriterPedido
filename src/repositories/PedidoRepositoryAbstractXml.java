package repositories;

import java.io.PrintWriter;

import entities.Pedido;

public class PedidoRepositoryAbstractXml extends PedidoRepositoryAbstract {

	@Override
	public void cadastrar(Pedido pedido) throws Exception {
		
		PrintWriter printWriter = new PrintWriter("pedido_" + pedido.getId() + ".xml");
		
		printWriter.write("<?xml version='1.0' encoding='utf-8'?>");
		printWriter.write("<pedido>");
		printWriter.write("<id>" + pedido.getId() + "</id>");
		printWriter.write("<valor>" + pedido.getValor() + "</valor>");
			printWriter.write("<cliente>");
			printWriter.write("<id>" + pedido.getCliente().getId() + "</id>");
			printWriter.write("<nome>" + pedido.getCliente().getNome() + "</nome>");
			printWriter.write("<cpf>" + pedido.getCliente().getCpf() + "</cpf>");
			printWriter.write("</cliente>");
			printWriter.write("<pagamento>");
			printWriter.write("<id>" + pedido.getPagamento().getId() + "</id>");
			printWriter.write("<numeroCartao>" + pedido.getPagamento().getNumeroCartao() + "</numeroCartao>");
			printWriter.write("<parcelas>" + pedido.getPagamento().getParcelas() + "</parcelas>");
			printWriter.write("</pagamento>");
		printWriter.write("</pedido>");
		
		printWriter.flush();
		printWriter.close();
		
	}

}
