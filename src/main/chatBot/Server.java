package main.chatBot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static final int PORT = 5445;

    public Server() {
        try (
                ServerSocket serverSocket = new ServerSocket(PORT);
                Socket clientSocket = serverSocket.accept();

                PrintWriter in = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader out = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            System.out.println("The Server is running..");

            startConversation(in, out);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startConversation(PrintWriter in, BufferedReader out) throws IOException {
        String input, answer;
        BotLogic botLogic = new BotLogic();
        answer = botLogic.process(null);
        in.println(answer);
        while (true) {
            input = out.readLine();
            if (input != null) {
                System.out.println("Client: " + input);
                answer = botLogic.process(input);
            } else {
                answer = "input something please.";
            }
            in.println(answer);
            System.out.println("Server: " + answer);
            if (outputLine.equals("Have a good day!"))
                break;
        }
    }


    public static void main(String[] args) {
        Server server = new Server();
    }

}
