package consultorioMedico;
public class PacienteParticular extends Paciente {
    private double costoConsulta;
    private String dni;

    public PacienteParticular(String nombre, String apellido, String fechaNacimiento, boolean primeraConsulta,
                              double costoConsulta, String dni) {
        super(nombre, apellido, fechaNacimiento, primeraConsulta);
        this.costoConsulta = costoConsulta;
        this.dni = dni;
    }

    public double getCostoConsulta() {
        return costoConsulta;
    }

    public String getNombre() {
        return super.getNombre();
    }

}
