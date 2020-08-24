package main.chatBot;

import org.junit.Test;

import java.io.*;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

    private static final int SERVER_PORT = 5445;
    private static final int CLIENT_PORT = 3445;

    private static final String HOST = "localhost";

    @Test
    public void testServer() throws IOException {

        ServerSocket server = new ServerSocket(5464);
        Socket clientSocket = new Socket(HOST, 5464);
        Socket socket = server.accept();

        PrintWriter in = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader out = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedReader outServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        in.println("hi");

        //assertTrue(clientSocket.isConnected());
        assert (outServer.readLine().equals("hi"));

        server.close();
        clientSocket.close();
    }

    @Test(expected = ConnectException.class)
    public void testClientServerConnection() throws IOException {

        ServerSocket server = new ServerSocket(SERVER_PORT);

        Socket clientSocket = new Socket(HOST, CLIENT_PORT);

        server.close();
        clientSocket.close();
    }

}
