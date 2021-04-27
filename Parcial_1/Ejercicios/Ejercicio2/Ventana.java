package Ejercicios.Ejercicio2;

import java.awt.Frame;
import java.awt.event.*;
import java.awt.Button;

public class Ventana  extends Frame implements ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    Button btn_click;
    boolean isClicked;


    public Ventana(){
        this.init();
        this.setSize(400, 300);
        this.setVisible(true);
    }
    public void init(){
        isClicked= false;
        btn_click=new Button("Presioname!!!");
        this.add(btn_click);
        btn_click.addActionListener(this);
    }
    public static void main( String args[]){
        Ventana v = new Ventana();
        v.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){

            System.exit(0);
            }
            });
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isClicked)
        {

        btn_click.setLabel("Presioname!!");
        }else{
            btn_click.setLabel("Presionado!!");
        }
        isClicked=!isClicked;
        
    }
}
