package consultorioMedico;
public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Consulta consulta = new Consulta("Cardiología", "Fecha actual", 10, 30);
        PacienteParticular pacienteParticular = new PacienteParticular("Mathias", "Curbelo", "Fecha actual", false, 50.0, "123456789");
        PacienteObraSocial pacienteObraSocial = new PacienteObraSocial("Jorgito", "Pereira", "Fecha actual", true, "ObraSocialX", 56789);

        // Imprimir información
        System.out.println("Información de la consulta:");
        System.out.println("Especialidad: " + consulta.getEspecialidad());
        System.out.println("Fecha de consulta: " + consulta.getFechaConsulta());
        System.out.println("Hora: " + consulta.getHora() + ":" + consulta.getMinuto());

        System.out.println("\nInformación del paciente particular:");
        System.out.println("Nombre: " + pacienteParticular.getNombre());
        System.out.println("Costo de consulta: " + pacienteParticular.getCostoConsulta());

        System.out.println("\nInformación del paciente de obra social:");
        System.out.println("Nombre: " + pacienteObraSocial.getNombre());
        System.out.println("Número de asociado: " + pacienteObraSocial.getNumeroAsociado());
    }
}