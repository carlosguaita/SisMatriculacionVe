public class Duenio {

    private String nombre;
    private String telefono;
    private int cedula;


    public Duenio(String nombre, String telefono, int cedula) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cedula = cedula;
    }

    public void informacion(){
        System.out.println("Información Dueño:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Cedula: " + cedula);
    }
}
