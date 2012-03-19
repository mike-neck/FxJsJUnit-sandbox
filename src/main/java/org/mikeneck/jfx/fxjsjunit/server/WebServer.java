package org.mikeneck.jfx.fxjsjunit.server;

import org.eclipse.jetty.server.Server;

import java.net.InetSocketAddress;

/**
 * @author: mike
 * @since: 12/03/11
 */
public class WebServer {

    private Server server;

    public WebServer () {
        server = createServer("localhost", 3080);
    }

    private Server createServer(String hostName, int portNumber) {
        InetSocketAddress address = supplyAddress(hostName, portNumber);
        return new Server(address);
    }

    private InetSocketAddress supplyAddress(String hostName, int portNumber){
        return new InetSocketAddress(hostName, portNumber);
    }

}
