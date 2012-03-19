package org.mikeneck.jfx.fxjsjunit.server.resources.contents;

import org.mikeneck.jfx.fxjsjunit.server.resources.Content;

import java.io.File;
import java.util.Map;

import static javax.servlet.http.HttpServletResponse.SC_OK;

/**
 * @author: mike
 * @since: 12/03/14
 */
public abstract class ExistingContent implements Content {

    protected File file;

    public ExistingContent (String fileName) {
        this.file = new File(fileName);
    }

    public ExistingContent (File file) {
        this.file = file;
    }

    @Override
    public int statusCode() {
        return SC_OK;
    }

    @Override
    public void cache(String target, Map<String, Content> cache) {
        cache.put(target, this);
    }
}
