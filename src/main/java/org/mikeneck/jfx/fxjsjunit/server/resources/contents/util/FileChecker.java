package org.mikeneck.jfx.fxjsjunit.server.resources.contents.util;

import java.io.File;

/**
 * @author: mike
 * @since: 12/03/19
 */
public class FileChecker {

    public static boolean exists(String fileName) {
        File file = new File(fileName);
        return file.exists() == true && file.isFile() == true;
    }
}
