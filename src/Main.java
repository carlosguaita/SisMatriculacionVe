//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo();

        v1.marca = "Chevrolet";
        v1.modelo = "Captiva";
        v1.placa = "PDU1234";
        v1.tipoCombustible = 1;
        v1.numRuedas = 4;
        v1.cilindraje = 1500;
        v1.torque = 100;

        double accV1 = v1.aceleracion();
        System.out.println("La aceleración de V1 es: " + accV1);
        v1.informacion();

        v2.marca = "Ford";
        v2.modelo = "EcoSport";
        v2.placa = "PDU4321";
        v2.tipoCombustible = 2;
        v2.numRuedas = 4;
        v2.cilindraje = 1500;
        v2.torque = 100;

        double accV2 = v2.aceleracion();
        System.out.println("La aceleración de V2 es: " + accV2);
        v2.informacion();


    }
}