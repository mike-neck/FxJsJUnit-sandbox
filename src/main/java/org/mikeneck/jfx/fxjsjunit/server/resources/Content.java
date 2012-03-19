package org.mikeneck.jfx.fxjsjunit.server.resources;

import java.util.Map;

/**
 * @author: mike
 * @since: 12/03/12
 */
public interface Content {

    public int statusCode();

    public String contentType();

    public void cache(String target, Map<String, Content> cache);
}
