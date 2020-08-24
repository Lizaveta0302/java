package chatBot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    private static final int PORT = 5445;
    private static final String HOST = "localhost";

    public Client() {

        try (
                Socket socket = new Socket(HOST, PORT);

                PrintWriter in = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader out = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                BufferedReader inputLine = new BufferedReader(new InputStreamReader(System.in))
        ) {

            System.out.println("The Client is running..");
            communicateWithServer(in, out, inputLine);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void communicateWithServer(PrintWriter in, BufferedReader out, BufferedReader inputLine) throws IOException {
        String answerFromServer, input;
        while (true) {
            answerFromServer = out.readLine();
            System.out.println("Server: " + answerFromServer);
            if (answerFromServer.equals("Have a good day!")) {
                break;
            }
            input = inputLine.readLine();
            in.println(input);
            System.out.println("Client:" + input);

        }
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
