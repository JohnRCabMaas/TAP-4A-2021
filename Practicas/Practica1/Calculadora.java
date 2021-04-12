package Practicas.Practica1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame {
    // @author johan cab maas
    private static final long serialVersionUID=1l;
    private Operaciones op;
    public Calculadora(String numero){
        super(numero);
        initComponents();
    }
    public void initComponents(){
        this.setLayout(new BorderLayout());
        op= new Operaciones();
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        txtResultado.setFont(new Font("Open Sans", 1, 18));
        txtResultado.setForeground(new Color(51, 51, 51));
        txtResultado.setText("inicie colocando un numero");
        txtResultado.setPreferredSize(new Dimension(430, 30));
        txtResultado.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt){
                txtResultadokeyTyped(evt);
            }
        });

        btnC = new JButton("C");
        btnC.setFocusable(false);
        btnC.setFont(new Font("Open Sans", 1, 16));
        btnC.addActionListener(evt -> btnCActionPerformed(evt));

        btn1 = new JButton("1");
        btn1.setFocusable(false);
        btn1.setFont(new Font("Open Sans", 1, 16));
        btn1.addActionListener(evt -> btnUnoActionPerformed(evt));

        btn2 = new JButton("2");
        btn2.setFocusable(false);
        btn2.setFont(new Font("Open Sans", 1, 16));
        btn2.addActionListener(evt -> btnDosActionPerformed(evt));

        btn3 = new JButton("3");
        btn3.setFocusable(false);
        btn3.setFont(new Font("Open Sans", 1, 16));
        btn3.addActionListener(evt -> btnTresActionPerformed(evt));

        btn4 = new JButton("4");
        btn4.setFocusable(false);
        btn4.setFont(new Font("Open Sans", 1, 16));
        btn4.addActionListener(evt -> btnCuatrosActionPerformed(evt));

        btn5 = new JButton("5");
        btn5.setFocusable(false);
        btn5.setFont(new Font("Open Sans", 1, 16));
        btn5.addActionListener(evt -> btnCincoActionPerformed(evt));

        btn6 = new JButton("6");
        btn6.setFocusable(false);
        btn6.setFont(new Font("Open Sans", 1, 16));
        btn6.addActionListener(evt -> btnSeisActionPerformed(evt));

        btn7 = new JButton("7");
        btn7.setFocusable(false);
        btn7.setFont(new Font("Open Sans", 1, 16));
        btn7.addActionListener(evt -> btnSieteActionPerformed(evt));

        btn8 = new JButton("8");
        btn8.setFocusable(false);
        btn8.setFont(new Font("Open Sans", 1, 16));
        btn8.addActionListener(evt -> btnOchoActionPerformed(evt));

        btn9 = new JButton("9");
        btn9.setFocusable(false);
        btn9.setFont(new Font("Open Sans", 1, 16));
        btn9.addActionListener(evt -> btnNueveActionPerformed(evt));

        btn0 = new JButton("0");
        btn0.setFocusable(false);
        btn0.setFont(new Font("Open Sans", 1, 16));
        btn0.addActionListener(evt -> btnCeroActionPerformed(evt));

        btnSuma = new JButton("+");
        btnSuma.setFocusable(false);
        btnSuma.setFont(new Font("Open Sans", 1, 16));
        btnSuma.addActionListener(evt -> btnSumaActionPerformed(evt));

        btnResta = new JButton("-");
        btnResta.setFocusable(false);
        btnResta.setFont(new Font("Open Sans", 1, 16));
        btnResta.addActionListener(evt -> btnRestaActionPerformed(evt));

        btnDivision = new JButton("/");
        btnDivision.setFocusable(false);
        btnDivision.setFont(new Font("Open Sans", 1, 16));
        btnDivision.addActionListener(evt -> btnDivActionPerformed(evt));

        btnMultiplicacion = new JButton("*");
        btnMultiplicacion.setFocusable(false);
        btnMultiplicacion.setFont(new Font("Open Sans", 1, 16));
        btnMultiplicacion.addActionListener(vst -> btnMultActionPerformed(vst));

        btnElevacion = new JButton("^");
        btnElevacion.setFocusable(false);
        btnElevacion.setFont(new Font("Open Sans", 1, 16));
        btnElevacion.addActionListener(vst -> btnElevadoActionPerformed(vst));

        btnSolucion = new JButton("=");
        btnSolucion.setFocusable(false);
        btnSolucion.setFont(new Font("Open Sans", 1, 16));
        btnSolucion.addActionListener(evt -> btnIgualActionPerformed(evt));


        Menu = new JPanel();
        Menu.add(txtResultado, BorderLayout.WEST);
        Menu.add(btnC, BorderLayout.EAST);
        
        
        contenedorNumeros = new JPanel();
        contenedorNumeros.setLayout(new GridLayout(4,4, 20, 20));
        contenedorNumeros.add(btn1);
        contenedorNumeros.add(btn2);
        contenedorNumeros.add(btn3);
        contenedorNumeros.add(btnSuma);
        contenedorNumeros.add(btn4);
        contenedorNumeros.add(btn5);
        contenedorNumeros.add(btn6);
        contenedorNumeros.add(btnResta);
        contenedorNumeros.add(btn7);
        contenedorNumeros.add(btn8);
        contenedorNumeros.add(btn9);
        contenedorNumeros.add(btnDivision);
        contenedorNumeros.add(btnMultiplicacion);
        contenedorNumeros.add(btn0);
        contenedorNumeros.add(btnElevacion);
        contenedorNumeros.add(btnSolucion);

        this.add(Menu, BorderLayout.NORTH);
        this.add(contenedorNumeros, BorderLayout.CENTER);

        //Personalizacion de la ventana
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

    }

    private void btnCActionPerformed(ActionEvent e){
        this.txtResultado.setText("");
    }

    private void btnUnoActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn1.getText());
    }

    private void btnDosActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn2.getText());
    }

    private void btnTresActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn3.getText());
    }

    private void btnCuatrosActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn4.getText());
    }

    private void btnCincoActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn5.getText());
    }

    private void btnSeisActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn6.getText());
    }

    private void btnSieteActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn7.getText());
    }

    private void btnOchoActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn8.getText());
    }

    private void btnNueveActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn9.getText());
    }

    private void btnCeroActionPerformed(ActionEvent e){
        txtResultado.setText(txtResultado.getText() + btn0.getText());
    }

    private void btnSumaActionPerformed(ActionEvent e){
        primero = Integer.parseInt(txtResultado.getText());
        operador = "+";
        txtResultado.setText("");
    }

    private void btnRestaActionPerformed(ActionEvent e){
        primero = Integer.parseInt(txtResultado.getText());
        operador = "-";
        txtResultado.setText("");
    }

    private void btnDivActionPerformed(ActionEvent e){
        primero = Integer.parseInt(txtResultado.getText());
        operador = "/";
        txtResultado.setText("");
    }
    
    private void btnMultActionPerformed(ActionEvent e){
        primero = Integer.parseInt(txtResultado.getText());
        operador = "*";
        txtResultado.setText("");
    }

    private void btnElevadoActionPerformed(ActionEvent e){
        primero = Integer.parseInt(txtResultado.getText());
        operador = "^";
        txtResultado.setText("");
    }

    private void btnIgualActionPerformed(ActionEvent e){
        segundo = Integer.parseInt(txtResultado.getText());
        txtResultado.setText(op.opResultado(operador, primero, segundo));
    }

    private void txtResultadokeyTyped(KeyEvent evt){
        if(txtResultado.getText().length() <= 20){
            //evt.consume();
            txtResultado.setText("Desbordamineto");
        }
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora("Calculadora");
        c.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // estas son las variables utilizadas en el programa
    JTextField txtResultado;
    JButton btnC;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn0;  
    JButton btnSuma;  
    JButton btnResta;
    JButton btnDivision;
    JButton btnMultiplicacion;
    JButton btnElevacion;
    JButton btnSolucion;
    JPanel Menu;
    JPanel contenedorNumeros;
    int primero;
    int segundo;
    String operador;
    

    }
