package org.example.demo;

import java.io.IOException;
import java.net.Socket;

public class SocketConnectionTest {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 8084;

        try {
            // Attempt to connect to the server
            Socket socket = new Socket(serverAddress, port);

            // If the connection is successful, print a success message
            System.out.println("Successfully connected to " + serverAddress + " on port " + port);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            // If an error occurs during the connection attempt, print an error message
            System.err.println("Failed to connect to " + serverAddress + " onn port " + port + ": " + e.getMessage());
         }
     }
}
