//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Vehiculo v1 = new Vehiculo("Chevrolet","Captiva","PDU1234",
                4,1500,100,1,
                "Juan","0987456321",123654789);
        Vehiculo v2 = new Vehiculo("Ford","EcoSport","PDU4321",
                4,1500,100,2,
                "Luis","0985236471",654123987);

        double accV1 = v1.aceleracion();
        System.out.println("La aceleración de V1 es: " + accV1);
        v1.informacion();
        v1.informacionDuenio();
        System.out.println("-------------------------------------------------");
        double accV2 = v2.aceleracion();
        System.out.println("La aceleración de V2 es: " + accV2);
        v2.informacion();
        v2.informacionDuenio();


    }
}