package Parcial_2.Ejercicios;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;


public class Ejercicio1 {
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    public Cliente() throws UnknownHostException,IOException{
        socket=new Socket("localhost",5000);
        in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream());
    }
    public void write throws IOException(){
        out.println("hola");
        out.flush();
        String line= in.eradLine();
        System.out.println(line);
    
    }

}
