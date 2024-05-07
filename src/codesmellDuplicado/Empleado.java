package codesmellDuplicado;

public class Empleado {
    private double salarioBase;
    private double horasExtras;
    private double bonificaciones;
    private String tipoEmpleado;

    public double calcularSalarioTotal() {
        double salarioTotal = salarioBase;

        if(tipoEmpleado == "VINCULADO") {
            calcularPagoExtra(0.25, 0.2);
        }

        if(tipoEmpleado == "PRESTADOR") {
            calcularPagoExtra(0.2, 0.1);
        }
        //extra centralice


        return salarioTotal;
    }

    public double calcularPagoExtra(double porcentajeHorasExtras, double porcentajeBonificaciones){
        double pagoExtra = 0;
        // Cálculo de horas extras
        if (horasExtras > 0) {
            pagoExtra += horasExtras *  porcentajeHorasExtras; // Tarifa por hora extra
        }
        // Cálculo de bonificaciones
        if (bonificaciones > 0) {
            pagoExtra += bonificaciones * porcentajeBonificaciones; // 5% de bonificación
        }

        return pagoExtra;
    }
}
