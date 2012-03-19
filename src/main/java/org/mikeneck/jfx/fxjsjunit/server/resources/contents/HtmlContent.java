package org.mikeneck.jfx.fxjsjunit.server.resources.contents;

import org.mikeneck.jfx.fxjsjunit.server.resources.Type;

import java.io.File;

/**
 * @author: mike
 * @since: 12/03/14
 */
public class HtmlContent extends ExistingContent {

    public HtmlContent(File file) {
        super(file);
    }

    public HtmlContent(String fileName) {
        super(fileName);
    }

    @Override
    public String contentType() {
        return Type.HTML.contentType();
    }
}
