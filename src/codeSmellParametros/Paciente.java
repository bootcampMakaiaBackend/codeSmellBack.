package codeSmellParametros;

public class Paciente {

    private Direccion direccion;
    private String nombrePaciente;
    private String documentoPaciente;
    private String fechaNacimientoPaciente;

    public Paciente(String nombrePaciente, String documentoPaciente, String ciudadPaciente, String fechaNacimientoPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.documentoPaciente = documentoPaciente;
        this.ciudadPaciente = ciudadPaciente;
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }
}
