public class Vehiculo {

    String marca;
    String modelo;
    String placa;
    int numRuedas;
    double cilindraje;
    double torque;
    int tipoCombustible; //1.Gasolina, 2.Diesel

    double aceleracion(){
        double acc;
        if(tipoCombustible==1){
            acc = cilindraje * torque * 2;
        }else{
            acc = cilindraje * torque;
        }
        return acc;
    }

    void informacion(){
        System.out.println("Información Vehículo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Numero Ruedas: " + numRuedas);
    }
}
