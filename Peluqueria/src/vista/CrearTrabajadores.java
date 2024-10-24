package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ControladorTrabajadores;
import modelo.Trabajadores;

public class CrearTrabajadores extends JFrame {
    private JLabel dniLabel;
    private JTextField dniField;
    private JLabel nombre_trabajadorLabel;
    private JTextField nombre_trabajadorField;
    private JLabel apellido_trabajadorLabel;
    private JTextField apellido_trabajadorField;
    private JLabel correo_trabajadorLabel;
    private JTextField correo_trabajadorField;
    private JLabel telefono_trabajadorLabel;
    private JTextField telefono_trabajadorField;
    private JLabel contrasenaLabel;
    private JTextField contrasenaField;
    private JLabel tipo_trabajadorLabel;
    private JCheckBox tipo_trabajadorCheckBox;
    private JLabel missatgeLabel;
    private JButton agregarTrabajadorButton;
    private JButton volverButton;
    private ControladorTrabajadores controladorTrabajadores;

    public CrearTrabajadores(Trabajadores trabajadores) {
        controladorTrabajadores = new ControladorTrabajadores(); // Inicializar el controlador.
        setTitle("Peluqueria"); // Pon un titulo a la pagina.
        setSize(800, 600); // Configuracion del tamaño de la pantalla.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Indica que la aplicación se cerrará completamente.
        setLocationRelativeTo(null); // Centra la ventana en la pantalla.

        // Creamos un panel para agregar los componetes que quieras.
        JPanel panel = new JPanel();
        add(panel);
        posicioBotons(panel, trabajadores);

        setVisible(true); 
    }

    private void posicioBotons(JPanel panel, Object trabajadores) {
        panel.setBackground(new Color(139, 137, 137)); // Canviar de color.
        panel.setLayout(null);


        Font nFont18 = new Font(null, Font.PLAIN, 18);


        dniLabel = new JLabel("DNI: ");
        dniLabel.setBounds(300, 40, 200, 25);
        dniLabel.setFont(nFont18);
        dniLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(dniLabel);

        dniField = new JTextField(20);
        dniField.setBounds(500, 40, 200, 25);
        dniField.setBackground(new Color(255, 255, 255)); 
        panel.add(dniField);


        nombre_trabajadorLabel = new JLabel("Nombre Trabajador: ");
        nombre_trabajadorLabel.setBounds(300, 80, 200, 25);
        nombre_trabajadorLabel.setFont(nFont18);
        nombre_trabajadorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(nombre_trabajadorLabel);

        nombre_trabajadorField = new JTextField(20);
        nombre_trabajadorField.setBounds(500, 80, 200, 25);
        nombre_trabajadorField.setBackground(new Color(255, 255, 255)); 
        panel.add(nombre_trabajadorField);


        apellido_trabajadorLabel = new JLabel("Apellido Trabajador: ");
        apellido_trabajadorLabel.setBounds(300, 120, 200, 25);
        apellido_trabajadorLabel.setFont(nFont18);
        apellido_trabajadorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(apellido_trabajadorLabel);

        apellido_trabajadorField = new JTextField(20);
        apellido_trabajadorField.setBounds(500, 120, 200, 25);
        apellido_trabajadorField.setBackground(new Color(255, 255, 255)); 
        panel.add(apellido_trabajadorField);


        correo_trabajadorLabel = new JLabel("Correo: ");
        correo_trabajadorLabel.setBounds(300, 160, 200, 25);
        correo_trabajadorLabel.setFont(nFont18);
        correo_trabajadorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(correo_trabajadorLabel);

        correo_trabajadorField = new JTextField(20);
        correo_trabajadorField.setBounds(500, 160, 200, 25);
        correo_trabajadorField.setBackground(new Color(255, 255, 255)); 
        panel.add(correo_trabajadorField);


        telefono_trabajadorLabel = new JLabel("Telefono: ");
        telefono_trabajadorLabel.setBounds(300, 200, 200, 25);
        telefono_trabajadorLabel.setFont(nFont18);
        telefono_trabajadorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(telefono_trabajadorLabel);

        telefono_trabajadorField = new JTextField(20);
        telefono_trabajadorField.setBounds(500, 200, 200, 25);
        telefono_trabajadorField.setBackground(new Color(255, 255, 255)); 
        panel.add(telefono_trabajadorField);


        contrasenaLabel = new JLabel("Contraseña: ");
        contrasenaLabel.setBounds(300, 240, 200, 25);
        contrasenaLabel.setFont(nFont18);
        contrasenaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(contrasenaLabel);

        contrasenaField = new JTextField(20);
        contrasenaField.setBounds(500, 240, 200, 25);
        contrasenaField.setBackground(new Color(255, 255, 255)); 
        panel.add(contrasenaField);


        tipo_trabajadorLabel = new JLabel("Administrador: ");
        tipo_trabajadorLabel.setBounds(300, 320, 200, 25);
        tipo_trabajadorLabel.setFont(nFont18);
        tipo_trabajadorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(tipo_trabajadorLabel);

        tipo_trabajadorCheckBox = new JCheckBox();
        tipo_trabajadorCheckBox.setBounds(500, 320, 200, 25);
        tipo_trabajadorCheckBox.setBackground(new Color(255, 255, 255)); 
        panel.add(tipo_trabajadorCheckBox);


        missatgeLabel = new JLabel("");
        missatgeLabel.setBounds(500, 400, 200, 25);
        missatgeLabel.setFont(nFont18);
        missatgeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(missatgeLabel);


        agregarTrabajadorButton = new JButton("Crear Trabajador");
        agregarTrabajadorButton.setBounds(500, 500, 200, 40);
        agregarTrabajadorButton.setHorizontalAlignment(SwingConstants.CENTER);
        agregarTrabajadorButton.setBackground(new Color(206, 63, 86));
        agregarTrabajadorButton.setFont(nFont18);
        agregarTrabajadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearTrabajador();
            }
        });
        panel.getRootPane().setDefaultButton(agregarTrabajadorButton); // Para poderlo pulsar con la tecla "INTRO".
        panel.add(agregarTrabajadorButton);

        
        volverButton = new JButton("Volver");
        volverButton.setBounds(50, 20, 200, 40);
        volverButton.setHorizontalAlignment(SwingConstants.CENTER);
        volverButton.setBackground(new Color(105, 123, 86));
        volverButton.setFont(nFont18);
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                volverAtras((Trabajadores) trabajadores);
            }
        });
        panel.add(volverButton);
    }

    // Metodos
    private  void volverAtras(Trabajadores trabajadores) {
        new Menu(trabajadores).setVisible(true);
        dispose();
    }

    private void crearTrabajador() {
        String dni = dniField.getText();
        String nombre = nombre_trabajadorField.getText();
        String apellido = apellido_trabajadorField.getText();
        String correo = correo_trabajadorField.getText();
        String telefono = telefono_trabajadorField.getText();
        String contrasena = contrasenaField.getText();
        Boolean trabajadorTipo = tipo_trabajadorCheckBox.isSelected(); // Jefe / Emlpeado;

        String missatge = "";
        Color colorMissatge = Color.BLUE;
        
        if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono.isEmpty() || contrasena.isEmpty()) {
            missatge = "Tienes que rellenar todos los campos";
        } else {
            Trabajadores trabajadores = new Trabajadores();
            trabajadores.setDni(dni);
            trabajadores.setNombreTrabajador(nombre);
            trabajadores.setApellidoTrabajador(apellido);
            trabajadores.setCorreoTrabajador(correo);
            trabajadores.setTelefonoTrabajador(telefono);
            trabajadores.setContrasena(contrasena);
            trabajadores.setTrabajadorActivo(true);
            trabajadores.setTipoTrabajador(trabajadorTipo);
            trabajadores.setComision(BigDecimal.ZERO);


            try {
                boolean resultat = controladorTrabajadores.anyadirTrabajadores(trabajadores);
                
                if (resultat) {
                    missatge = "¡Tabajador Creado!";
                    colorMissatge = Color.GREEN;
                }
            } catch (RuntimeException ex) {
                if (ex.getMessage().equals("BaseDatos NO encontrada")) {
                    missatge = "Base de datos no encontrada";
                    colorMissatge = Color.BLACK;
                } else {
                    ex.printStackTrace();
                }
            }
        }
        missatgeLabel.setText(missatge);
        missatgeLabel.setForeground(colorMissatge);
    }
}