package util;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    private  static ArrayList<ClientHandler>clients=new ArrayList();

    public static void main(String[] args) throws IOException {
        Socket localSocket;
        ServerSocket serverSocket = new ServerSocket(7000);

        while (true){
            System.out.println("Waiting for Client ...");
            localSocket = serverSocket.accept();
            System.out.println("Client Connected");
            ClientHandler clientThread = new ClientHandler(localSocket, clients);
            clients.add(clientThread);
            clientThread.start();

        }

    }
}
