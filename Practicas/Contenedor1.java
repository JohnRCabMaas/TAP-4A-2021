package Practicas;
//autor : johan rodrigo cab maas

import java.awt.*;


public class Contenedor1 extends Canvas {
    private static final long serialVersionUID = 1L;
private int xx,yy,k,z;
private boolean isClicked;
public Contenedor1(){
    xx=40;
    yy=40;
    isClicked= false;

}
public void  paint(Graphics g){
    g.setColor(Color.RED);
    g.drawRect(xx,yy,k,z);
    g.fillOval(xx,yy,k,z);

}
public int setX(int x){
    return xx=x;
}
public int setY(int y){
    return yy=y;
}
public int setK(int width){
    return k=width;
}
public int setZ(int heigth){
    return z=heigth;
}
public boolean isClicked(){
    return isClicked;
}
public void setClicked(){
    this.isClicked=!this.isClicked;
}
    
    
}
