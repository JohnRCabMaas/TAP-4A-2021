package Parcial_2;
import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWrite;

public class Servidor {
    ServerSocket server:
    BufferedReader in;
    PrintWriter out;
    public Servidor()throws IOException{
        server= new ServerSocket(5000);
        Socket cc = server.accept();
        in = new BufferedReader(newInputStreamReader(cc.getInputStream()));
        out = new PrintWriter(cc.getOutputStream());


    }
    read(){
        String line = in.readLine():
        switch(line){
            case"hola";
            System.out.println("Me estas saludando")
            out.println("hola tambien");
            out.flush();
            break;
            case"adios";
            System.out.println("jajaja")
            out.println("adios igual");
            out.flush();
            break;
            case"cual es mi calificacion";
            System.out.println("nada mas para eso veniste")
            out.println("0");
            out.flush();
            break;
        }
        in.closed();
        out.closed();
    }
    public static void main(String arg[]){
        try{
            Servidor s= new Servidor();
        }catch()
    }
}
