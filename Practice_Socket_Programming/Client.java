package Practice_Socket_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            //Created a socket on the client side which will make request to the socket available at given port number
            Socket socket = new Socket("localhost", 9999);

            //Created BufferedReader to Read the Input stream of the socket i.e. message sent by Server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //Created PrintWriter object to push the message towards the Server
            PrintWriter out = new PrintWriter(socket.getOutputStream());

            String line = null;
            Scanner sc = new Scanner(System.in);
            while(!"exit".equalsIgnoreCase(line)){
                System.out.println("Server: "+in.readLine());
                line = sc.nextLine();
                out.println(line);
                out.flush();
            }
            socket.close();
            sc.close();

        } catch (IOException e) {
            (e).printStackTrace();
        }
    }
}
