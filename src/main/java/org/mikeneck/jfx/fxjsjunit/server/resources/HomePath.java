package org.mikeneck.jfx.fxjsjunit.server.resources;

import java.io.File;
import java.util.IllformedLocaleException;

/**
 * @author: mike
 * @since: 12/03/11
 */
public class HomePath {

    public static final String DEFAULT_HOME_PATH = "src/test/resources";

    private String path;

    public HomePath() {
        this.path = DEFAULT_HOME_PATH;
    }

    public HomePath(String homePath) throws IllegalArgumentException {
        this.path = validatePath(homePath);
    }

    private String validatePath(String homePath) throws IllegalArgumentException {
        if (homePath == null) {
            throw new IllegalArgumentException("path should not be null value.");
        }
        File directory = new File(homePath);
        if (directory.exists() == false || directory.isDirectory() == false) {
            throw new IllegalArgumentException("The path [" + homePath + "] doesn't exist or is not directory.");
        }
        return homePath;
    }

    public String getPath() {
        return path;
    }

    public String getPath(String target) {
        StringBuilder builder = new StringBuilder(getPath());
        String targetPath = builder.append(File.separator)
                .append(target)
                .toString();
        return targetPath;
    }
}
