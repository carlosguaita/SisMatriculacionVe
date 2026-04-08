import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Sistema {

    Scanner sc;
    BufferedReader br;

    public Sistema() {
        sc = new Scanner(System.in);
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("Seleccione una opcion:");
        System.out.println("1.Crear vehículo");
        System.out.println("2.Actualizar vehículo");
        System.out.println("3.Información del vehículo");
        System.out.println("4.Ver aceleración del vehículo");
        System.out.println(">> ");
        opc = sc.nextInt();
        return opc;
    }


    public Vehiculo crearVehiculo() {
        System.out.println("Ingrese los datos del vehículo:");
        System.out.print("Marca: ");
        String marca = sc.next();
        System.out.print("Modelo: ");
        String modelo = sc.next();
        System.out.print("Placa: ");
        String placa = sc.next();
        System.out.print("Numero de ruedas: ");
        int numRuedas = sc.nextInt();
        System.out.print("Cilindraje: ");
        double cilindraje = sc.nextDouble();
        System.out.print("Torque: ");
        double torque = sc.nextDouble();
        System.out.print("Combustible 1.Gasolina/2.Diesel : ");
        int tipoCombustible = sc.nextInt();
        Duenio duenio = this.crearDuenio();
        Vehiculo vehiculo = new Vehiculo(marca, modelo, placa, numRuedas,
                cilindraje, torque, tipoCombustible, duenio);
        return vehiculo;
    }


    public Duenio crearDuenio() {
        try {
            System.out.println("Ingrese los datos del Dueño:");
            System.out.print("Nombre: ");
            String nombre = sc.next();
            System.out.print("Cédula: ");
            int cedula = sc.nextInt();
            System.out.print("Teléfono: ");
            String telefono = sc.next();
            Duenio duenio = new Duenio(nombre, telefono, cedula);
            System.out.print("Año de nacimiento: ");
            int anio = Integer.parseInt(br.readLine());
            System.out.print("Mes de nacimiento (1 - 12): ");
            int mes = Integer.parseInt(br.readLine());
            System.out.print("Día de nacimiento (1 - 30): ");
            int dia = Integer.parseInt(br.readLine());
            duenio.setFechaNacimiento(anio, mes, dia);
            return duenio;
        }catch (IOException ex){
            System.out.println("Error en la lectura de datos");
            return null;
        }
    }


    public void imprimirDuenio(Duenio duenio) {
        System.out.println("Datos del Dueño:");
        System.out.println("Nombre: " + duenio.getNombre());
        System.out.println("Cédula: " + duenio.getCedula());
        System.out.println("Teléfono: " + duenio.getTelefono());
        System.out.println("Edad: " + duenio.calcularEdad());
    }

    public void imprimirVehiculo(Vehiculo vehiculo) {
        System.out.println("Información Vehículo:");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Placa: " + vehiculo.getPlaca());
        System.out.println("Numero Ruedas: " + vehiculo.getNumRuedas());
        System.out.println("Cilindraje: " + vehiculo.getCilindraje());
        System.out.println("Torque: " + vehiculo.getTorque());
        System.out.println("Combustible: " + (vehiculo.getTipoCombustible() == 1 ? "Gasolina" : "Diesel"));
        this.imprimirDuenio(vehiculo.getDuenio());
    }

    public void imprimirAceleracion(Vehiculo vehiculo) {
        double accV = vehiculo.aceleracion();
        System.out.println("La aceleración del vehículo es: " + accV);
    }


    public void actualizarVehiculo(Vehiculo vehiculo) {
        System.out.println("Actualizar Información Vehículo:");
        System.out.print("Marca (" + vehiculo.getMarca() + "): ");
        String marca = sc.next();
        vehiculo.setMarca(marca);
        System.out.print("Modelo (" + vehiculo.getModelo() + "): ");
        String modelo = sc.next();
        vehiculo.setModelo(modelo);
        System.out.print("Placa (" + vehiculo.getMarca() + "): ");
        String placa = sc.next();
        vehiculo.setPlaca(placa);
        System.out.print("Numero Ruedas (" + vehiculo.getNumRuedas() + "): ");
        int numRuedas = sc.nextInt();
        vehiculo.setNumRuedas(numRuedas);
        System.out.print("Cilindraje (" + vehiculo.getCilindraje() + "): ");
        double cilindraje = sc.nextDouble();
        vehiculo.setCilindraje(cilindraje);
        System.out.print("Torque (" + vehiculo.getTorque() + "): ");
        double torque = sc.nextDouble();
        vehiculo.setTorque(torque);
        System.out.print("Combustible (" + (vehiculo.getTipoCombustible() == 1 ? "Gasolina" : "Diesel") + ") 1.Gadolina/2.Diesel: ");
        int tipoCombustible = sc.nextInt();
        vehiculo.setTipoCombustible(tipoCombustible);
    }


}
