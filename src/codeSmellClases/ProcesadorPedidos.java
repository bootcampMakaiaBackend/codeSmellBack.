package codeSmellClases;

import codeSmellMetodosLargos.negocio.Pedido;

public class ProcesadorPedidos {
    Notificador notificador;
    Reporte reporte;
    // Métodos para procesar pedidos
    public void procesarPedido(Pedido pedido) {
        // Lógica para procesar el pedido

        notificador.enviarNotificacionCliente();
        reporte.generarReporteVentas();
    }
}
