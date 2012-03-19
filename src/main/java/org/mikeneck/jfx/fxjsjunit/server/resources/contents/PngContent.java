package org.mikeneck.jfx.fxjsjunit.server.resources.contents;

import org.mikeneck.jfx.fxjsjunit.server.resources.Type;

import java.io.File;

/**
 * @author: mike
 * @since: 12/03/14
 */
public class PngContent extends ExistingContent {

    public PngContent(File file) {
        super(file);
    }

    public PngContent(String fileName) {
        super(fileName);
    }

    @Override
    public String contentType() {
        return Type.PNG.contentType();
    }
}
