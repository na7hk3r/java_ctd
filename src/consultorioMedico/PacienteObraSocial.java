package consultorioMedico;
public class PacienteObraSocial extends Paciente {
    private String nombreObraSocial;
    private int numeroAsociado;

    public PacienteObraSocial(String nombre, String apellido, String fechaNacimiento, boolean primeraConsulta,
                              String nombreObraSocial, int numeroAsociado) {
        super(nombre, apellido, fechaNacimiento, primeraConsulta);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }

    public String getNombreObraSocial() {
        return nombreObraSocial;
    }

    public int getNumeroAsociado() {
        return numeroAsociado;
    }

    public String getNombre() {
        return super.getNombre();
    }

    public static int compararPorAsociados(PacienteObraSocial paciente1, PacienteObraSocial paciente2) {
        return Integer.compare(paciente1.numeroAsociado, paciente2.numeroAsociado);
    }
}