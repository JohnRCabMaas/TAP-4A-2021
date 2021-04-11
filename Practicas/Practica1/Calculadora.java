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
        
    }
}
