package consultorioMedico;
public class Paciente {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private boolean primeraConsulta;

    public Paciente(String nombre, String apellido, String fechaNacimiento, boolean primeraConsulta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.primeraConsulta = primeraConsulta;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean requiereEvaluacionInicial() {
        return primeraConsulta;
    }
}

