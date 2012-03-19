package org.mikeneck.jfx.fxjsjunit.server.resources.contents;

import java.io.File;

/**
 * @author: mike
 * @since: 12/03/17
 */
public class GifContent extends ExistingContent {
    public GifContent(File file) {
        super(file);
    }

    public GifContent(String fileName) {
        super(fileName);
    }

    @Override
    public String contentType() {
        // TODO auto generated body
        return null;
    }
}
