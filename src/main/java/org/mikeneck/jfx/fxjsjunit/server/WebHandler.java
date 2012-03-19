package org.mikeneck.jfx.fxjsjunit.server;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.mikeneck.jfx.fxjsjunit.server.resources.HomePath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: mike
 * @since: 12/03/11
 */
public class WebHandler extends AbstractHandler {

    private static Logger logger = LoggerFactory.getLogger(WebHandler.class);

    private HomePath homePath;

    public WebHandler() {
        homePath = new HomePath();
    }

    public WebHandler(String homePath) {
        this.homePath = new HomePath(homePath);
    }

    /**
     * Handle a request.
     *
     * @param target      The target of the request - either a URI or a name.
     * @param baseRequest The original unwrapped request object.
     * @param request     The request either as the {@link org.eclipse.jetty.server.Request}
     *                    object or a wrapper of that request. The {@link org.eclipse.jetty.server.AbstractHttpConnection#getCurrentConnection()}
     *                    method can be used access the Request object if required.
     * @param response    The response as the {@link org.eclipse.jetty.server.Response}
     *                    object or a wrapper of that request. The {@link org.eclipse.jetty.server.AbstractHttpConnection#getCurrentConnection()}
     *                    method can be used access the Response object if required.
     * @throws java.io.IOException
     * @throws javax.servlet.ServletException
     */
    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        logger.debug("web request : {}", target);
    }
}
