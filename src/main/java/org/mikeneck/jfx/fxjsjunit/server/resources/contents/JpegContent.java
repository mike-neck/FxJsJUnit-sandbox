package org.mikeneck.jfx.fxjsjunit.server.resources.contents;

import org.mikeneck.jfx.fxjsjunit.server.resources.Type;

import java.io.File;

/**
 * @author: mike
 * @since: 12/03/17
 */
public class JpegContent extends ExistingContent {

    public JpegContent(File file) {
        super(file);
    }

    public JpegContent(String fileName) {
        super(fileName);
    }

    @Override
    public String contentType() {
        return Type.JPEG.contentType();
    }
}
