package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
    public static void main(String[] args) throws Exception {
        // Create a Jetty server
        Server server = new Server();

        // Configure SSL
        SslContextFactory.Server sslContextFactory = new SslContextFactory.Server();
        sslContextFactory.setKeyStorePath("/app/keystore.jks"); // Path to the keystore
        sslContextFactory.setKeyStorePassword("DummyPassword123"); // Keystore password
        sslContextFactory.setKeyManagerPassword("DummyPassword123"); // Key manager password
        sslContextFactory.setEndpointIdentificationAlgorithm(null);

        // Create an HTTPS connector
        ServerConnector sslConnector = new ServerConnector(server, sslContextFactory);
        sslConnector.setPort(8080); // HTTPS port
        server.addConnector(sslConnector);

        // Configure the servlet context handler
        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet(new ServletHolder(new HelloServlet()), "/");

        server.setHandler(handler);

        // Start the server
        server.start();
        server.join();
    }
}
