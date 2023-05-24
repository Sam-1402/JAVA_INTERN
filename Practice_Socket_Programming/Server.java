package Practice_Socket_Programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        //Created a ServerSocket to maintain the Number of Sockets according to the requirement
        ServerSocket ss = null;
        try{
            System.out.println("Server Has Been Started!!");

            //ServerSocket is set to the port number where it will receive the socket request from client
            ss = new ServerSocket(9999);
            ss.setReuseAddress(true); //with this we have set our ServerSocket to reuse the port for another sockets

            System.out.println("Server: Waiting for a client to Connect!!");
            int clientno = 1;

            //Applied a while(true) loop to keep the server running for accepting new client socket requests
            while(true) {

                //When ServerSocket accepts the request from client side it gives socket object;
                Socket client = ss.accept();
                String name = "CLient-"+clientno;
                clientno++;
                System.out.println("Server: "+name+" is Connected : " + client.getInetAddress().getHostAddress());

                //This is the Runnable implemented class which is used to define the task.
                clientHandler ch = new clientHandler(client);

                //Thread for each client is created and started
                Thread t = new Thread(ch);
                t.start();

            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            if(ss != null){
                try {
                    //Closing the ServerSocket after its usage
                    ss.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
class clientHandler implements Runnable{
    private final Socket clientSock;
    public clientHandler(Socket socket){
        this.clientSock = socket;
    }

    public void run() {
        //Created PrintWriter object to push the message towards the client
        PrintWriter out = null;

        //Created BufferedReader to Read the Input stream of the socket i.e. message sent by Client
        BufferedReader in = null;
        try {
            out = new PrintWriter(clientSock.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSock.getInputStream()));
            out.println("Set Name Please");
            out.flush();
            String name = in.readLine();
            out.println("Hi "+name+"!!");
            out.flush();
            String l;
            while((l = in.readLine()) != null){
                System.out.println(name+": "+l);
                String reply = "I got you "+name;
                out.println(reply);
                out.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            try {
                if (out != null) {
                    //PrintWriter Object is closed after usage
                    out.close();
                }
                if (in != null) {
                    //BufferedReader & Socket Object is closed after usage
                    in.close();
                    clientSock.close();
                }
            }
            catch (IOException e){
                throw new RuntimeException(e);
            }
        }

    }
}
