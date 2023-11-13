package consultorioMedico;
public class Fecha {
    private String fecha;

    public Fecha() {
        this.fecha = obtenerFechaActual();
    }

    public Fecha(int anio, int mes, int dia) {
        this.fecha = obtenerFechaFormateada(anio, mes, dia);
    }

    private String obtenerFechaActual() {
        return "Fecha actual";
    }

    private String obtenerFechaFormateada(int anio, int mes, int dia) {
        return "Fecha: " + anio + "-" + mes + "-" + dia;
    }

    @Override
    public String toString() {
        return fecha;
    }
}
