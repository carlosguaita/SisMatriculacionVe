import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class SistemaGUI extends JFrame{
    private JPanel contenedor;
    private JButton crearVehículoButton;
    private JButton editarVehículoButton;
    private JTextField txtVehiculoSeleccionado;
    private JTextArea textListaVehiculos;

    List<Vehiculo> vehiculos = new ArrayList<>();

    CrearVehiculo dialogoCreacionVehiculo;

    public SistemaGUI() {
        setContentPane(contenedor);

        dialogoCreacionVehiculo = new CrearVehiculo(vehiculos,textListaVehiculos);

        crearVehículoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialogoCreacionVehiculo.pack();
                dialogoCreacionVehiculo.resetDialogo();
                dialogoCreacionVehiculo.setVisible(true);
            }
        });
        editarVehículoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
