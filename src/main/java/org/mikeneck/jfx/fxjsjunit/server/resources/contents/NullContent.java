package org.mikeneck.jfx.fxjsjunit.server.resources.contents;

import org.mikeneck.jfx.fxjsjunit.server.resources.Content;

import java.util.Map;

import static javax.servlet.http.HttpServletResponse.SC_NOT_FOUND;

/**
 * @author: mike
 * @since: 12/03/13
 */
public class NullContent implements Content {
    @Override
    public int statusCode() {
        return SC_NOT_FOUND;
    }

    @Override
    public String contentType() {
        return "";
    }

    @Override
    public void cache(String target, Map<String, Content> cache) {
    }
}
