public class Profesor extends Person {
    private String especialidad;
    private String grupo;

    public Profesor(String nombre, int edad, String especialidad, String grupo) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.grupo = grupo;
    }

    public void mostrarInfoProfesor() {
        presentarse();
        System.out.println("Soy profesor de " + especialidad + " y estoy a cargo del grupo " + grupo + ".");
    }

    // Getters y setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
