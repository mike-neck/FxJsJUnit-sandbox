package org.mikeneck.jfx.fxjsjunit.server.resources.contents;

import org.mikeneck.jfx.fxjsjunit.server.resources.Type;

import java.io.File;

/**
 * @author: mike
 * @since: 12/03/15
 */
public class CsvContent extends ExistingContent {

    public CsvContent(File file) {
        super(file);
    }

    public CsvContent(String fileName) {
        super(fileName);
    }

    @Override
    public String contentType() {
        return Type.CSV.contentType();
    }
}
