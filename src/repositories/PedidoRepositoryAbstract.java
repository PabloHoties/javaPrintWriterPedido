package repositories;

import entities.Pedido;

public abstract class PedidoRepositoryAbstract {

	public abstract void cadastrar(Pedido pedido) throws Exception;
}
