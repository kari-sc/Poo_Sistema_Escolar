public class Estudiante extends Person {
    private String matricula;
    private String carrera;

    public Estudiante(String nombre, int edad, String matricula, String carrera) {
        super(nombre, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void mostrarInfoEstudiante() {
        presentarse();
        System.out.println("Soy estudiante de la carrera de " + carrera + " con matrícula " + matricula + ".");
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
