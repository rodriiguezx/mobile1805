class PedidoCanceladoStrategy : PedidoStrategy {
    override fun processar(pedido: Pedido) {
        println("Pedido cancelado.")
    }
