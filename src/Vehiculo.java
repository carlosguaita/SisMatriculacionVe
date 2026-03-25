public class Vehiculo {

    private String marca;
    private String modelo;
    private String placa;
    private int numRuedas;
    private double cilindraje;
    private double torque;
    private int tipoCombustible; //1.Gasolina, 2.Diesel
    private Duenio duenio;



    public Vehiculo(String marca, String modelo, String placa,
                    int numRuedas, double cilindraje, double torque, int tipoCombustible,
                    String nombreDuenio, String telefonoDuenio, int cedulaDuenio){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.numRuedas = numRuedas;
        this.cilindraje = cilindraje;
        this.torque = torque;
        this.tipoCombustible = tipoCombustible;
        this.duenio = new Duenio(nombreDuenio,telefonoDuenio,cedulaDuenio);
    }

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

    public void informacionDuenio(){
        this.duenio.informacion();
    }
}
