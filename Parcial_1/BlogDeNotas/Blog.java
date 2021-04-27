package BlogDeNotas;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Blog extends JFrame implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    Blog() {
        initComponents();
    }

    public void initComponents() {

        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());

        btnColor = new Button("Color");
        btnColor.setFocusable(false);
        btnColor.addActionListener(this);

        btnComilla = new Button("Comilla");
        btnComilla.setFocusable(false);
        btnComilla.addActionListener(this);

        btnTamanio = new Button("Tamaño");
        btnTamanio.setFocusable(false);
        btnTamanio.addActionListener(this);

        btnAbrir = new Button("Abrir");
        btnAbrir.setFocusable(false);
        btnAbrir.addActionListener(this);

        btnGuardar = new Button("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.addActionListener(this);

        btnSalir = new Button("Salir");
        btnSalir.setFocusable(false);
        btnSalir.addActionListener(this);

        txtBlocNotas = new JTextArea();
        txtBlocNotas.setColumns(20);
        txtBlocNotas.setRows(5);
        txtBlocNotas.setFont(new Font("Open Sans", 1, 14));
        txtBlocNotas.setPreferredSize(new Dimension(450, 400));

        txtEstado = new JLabel(" Estado ");

        barraMenu = new JPanel();
        barraMenu.add(btnColor);
        barraMenu.add(btnComilla);
        barraMenu.add(btnTamanio);
        barraMenu.add(btnAbrir);
        barraMenu.add(btnGuardar);
        barraMenu.add(btnSalir);
        contenedor.add(barraMenu);

        contenedorTexto = new JPanel();
        contenedorTexto.add(txtBlocNotas);
        contenedor.add(contenedorTexto);

        barraEstado = new JPanel();
        barraEstado.add(txtEstado);
        contenedor.add(barraEstado);

        archivo = new File("Nota.txt");

        // Tamaño de la ventana
        this.setSize(500, 500);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Acciones de los Botones
        if (e.getSource() == btnColor) {
            try {
                // String color = JOptionPane.showOptionDialog(null, "Pulsa un boton:",
                // "Javadesde0.com", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                // null, colores, colores[0]) + " ";
                int c = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Elija su Color Segun El Numero\n" + "0 - Negro\n" + "1 - Azul\n" + "2 - Rojo\n" + "3 - Cyan(Cian)\n"
                                ));
                cambiarColor(c);
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        if (e.getSource() == btnComilla) {
            try {
                ponerComilla();
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        if (e.getSource() == btnTamanio) {
            try {
                int tam = Integer.parseInt(
                        JOptionPane.showInputDialog(null, "Marque El Tamaño del Texto", JOptionPane.OK_OPTION));
                cambiarTamanio(tam);
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        if (e.getSource() == btnAbrir) {
            String documento = abrirarchivo(archivo);
            txtBlocNotas.setText(documento);
        }
        if (e.getSource() == btnGuardar) {
            try {
                guardarArchivo();
            } catch (Exception exc) {
                System.out.println(exc);
            }
        }
        if (e.getSource() == btnSalir) {
            System.exit(0);
        }
    }

    public void cambiarColor(int c) {
        switch (c) {
        case 0:
            txtBlocNotas.setForeground(Color.BLACK);
            break;
        case 1:
            txtBlocNotas.setForeground(Color.BLUE);
            break;
        case 2:
            txtBlocNotas.setForeground(Color.RED);
            break;
        case 3:
            txtBlocNotas.setForeground(Color.CYAN);
            break;
        default:
            txtBlocNotas.setForeground(Color.BLACK);
            txtEstado.setText("El color que usted selecciono no existe");
            break;
        }
        txtEstado.setText("Color Cambiado");
    }

    private void cambiarTamanio(int tam) {
        txtBlocNotas.setFont(new Font("Open Sans", 1, tam));
        txtEstado.setText("Tamaño Cambiado");
    }

    private void ponerComilla() {
        // String texto = txtBlocNotas.getSelectedText();
        String texto = txtBlocNotas.getText();
        if (!texto.contains("'")) {
            txtBlocNotas.setText("");
            txtBlocNotas.setText("'" + texto + "'");
        } else {
            txtBlocNotas.setText(texto);
        }
    }

    private String abrirarchivo(File arc) {

        FileInputStream entrada;
        String document = "";
        try {
            entrada = new FileInputStream(arc);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                char caracter = (char) ascci;
                document += caracter;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        txtEstado.setText("Archivo Abierto");
        return document;
    }

    private void guardarArchivo() {
        try {
            File dir = new File("Nota.txt");
            FileWriter archivo = new FileWriter(dir, true);
            String texto = txtBlocNotas.getText() + "\n";
            archivo.write(texto);
            archivo.close();
            txtEstado.setText("Guardado");
        } catch (Exception ex) {
            System.out.println("Error " + ex);
        }
    }

    public static void main(String[] args) {
        Blog testLayout = new Blog();
        testLayout.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    JPanel barraMenu;
    JPanel contenedorTexto;
    JPanel barraEstado;
    Button btnSalir;
    Button btnGuardar;
    Button btnColor;
    Button btnTamanio;
    Button btnAbrir;
    Button btnComilla;
    JTextArea txtBlocNotas;
    JLabel txtEstado;
    File archivo;

}
