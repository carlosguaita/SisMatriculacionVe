//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Sistema sis = new Sistema();
        Vehiculo v1 = new Vehiculo();
        int opc = Sistema.menu();

        switch (opc){
            case 1:
                v1 = sis.crearVehiculo();
                break;
            case 2:
                sis.actualizarVehiculo(v1);
                break;
            case 3:
                sis.imprimirVehiculo(v1);
                break;
            case 4:
                sis.imprimirAceleracion(v1);
                break;
        }

    }
}