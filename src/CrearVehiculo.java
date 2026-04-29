import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class CrearVehiculo extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textMarca;
    private JTextField textModelo;
    private JTextField textPlaca;
    private JTextField textNombre;
    private JTextField textCedula;
    private JTextField textTelefono;

    private List<Vehiculo> vehiculos;
    private JTextArea textListaVehiculos;


    public CrearVehiculo(List<Vehiculo> vehiculos, JTextArea textListaVehiculos) {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        this.vehiculos = vehiculos;
        this.textListaVehiculos = textListaVehiculos;


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public void resetDialogo(){
        textCedula.setText("");
        textNombre.setText("");
        textTelefono.setText("");
        textPlaca.setText("");
        textMarca.setText("");
        textModelo.setText("");
    }

    private void onOK() {
        String nombre = textNombre.getText();
        int cedula = Integer.parseInt(textCedula.getText());
        String telefono = textTelefono.getText();
        Duenio duenio = new Duenio(nombre,telefono,cedula);

        String placa = textPlaca.getText();
        String modelo = textModelo.getText();
        String marca = textMarca.getText();

        Vehiculo vehiculo = new Vehiculo(marca,modelo,placa,duenio);

        vehiculos.add(vehiculo);

        textListaVehiculos.setText("");

        StringBuilder texto = new StringBuilder("");

        int i = 0;
        for (Vehiculo vehiculo1 : vehiculos){
            texto.append(i+": "+vehiculo1);
            i++;
        }
        textListaVehiculos.setText(texto.toString());


        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
