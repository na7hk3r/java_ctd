package consultorioMedico;
public class Consulta {
    private Fecha fechaConsulta;
    private String especialidad;
    private int hora;
    private int minuto;

    public Consulta(String especialidad, String fecha, int hora, int minuto) {
        this.especialidad = especialidad;
        this.fechaConsulta = new Fecha();  // Puedes ajustar según tus necesidades
        this.hora = hora;
        this.minuto = minuto;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Fecha getFechaConsulta() {
        return fechaConsulta;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }
}
