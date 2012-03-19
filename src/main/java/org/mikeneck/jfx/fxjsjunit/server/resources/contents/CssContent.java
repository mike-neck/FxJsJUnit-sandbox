package org.mikeneck.jfx.fxjsjunit.server.resources.contents;

import org.mikeneck.jfx.fxjsjunit.server.resources.Type;

import java.io.File;

/**
 * @author: mike
 * @since: 12/03/17
 */
public class CssContent extends ExistingContent {

    public CssContent(File file) {
        super(file);
    }

    public CssContent(String fileName) {
        super(fileName);
    }

    @Override
    public String contentType() {
        return Type.CSS.contentType();
    }
}
