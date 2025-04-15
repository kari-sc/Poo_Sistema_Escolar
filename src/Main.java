public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Karime", 18, "2470239", "Ingeniería en Sistemas");
        Profesor profesor = new Profesor("Carlos", 45, "Matemáticas", "3A");

        estudiante.mostrarInfoEstudiante();
        System.out.println(); // Espacio
        profesor.mostrarInfoProfesor();
    }
}
