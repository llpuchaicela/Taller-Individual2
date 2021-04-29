
public class Estudiante {

    private String cedula;
    private String apellidos;
    private String nombres;
    boolean activo;

    public Estudiante(String cedula, String apellidos) {
        this.cedula = cedula;
        this.apellidos = apellidos;

    }

    public Estudiante(String cedula, String apellidos, String nombres) {
        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;

    }

    public void setcedula(String cedula) {
        this.cedula = cedula;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void getnombres() {
        this.nombres = nombres;
    }
    public boolean isActivo(){
        return activo;
    }
}
