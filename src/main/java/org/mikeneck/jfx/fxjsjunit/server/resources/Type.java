package org.mikeneck.jfx.fxjsjunit.server.resources;

import org.mikeneck.jfx.fxjsjunit.server.resources.contents.util.FileChecker;
import org.mikeneck.jfx.fxjsjunit.server.resources.contents.*;

/**
 * @author: mike
 * @since: 12/03/14
 */
public enum Type {
    HTML {
        @Override
        public boolean matchesType(String fileName) {
            String file = fileName.toUpperCase();
            return FileChecker.exists(fileName) && (file.endsWith(".HTML") || file.endsWith(".HTM"));
        }

        @Override
        public String contentType() {
            return "text/html";
        }

        @Override
        public Content content(String fileName) {
            return new HtmlContent(fileName);
        }
    }, JS {
        @Override
        public boolean matchesType(String fileName) {
            String file = fileName.toUpperCase();
            return FileChecker.exists(fileName) && file.endsWith(".JS");
        }

        @Override
        public String contentType() {
            return "text/javascript";
        }

        @Override
        public Content content(String fileName) {
            return new JavascriptContent(fileName);
        }
    }, CSV {
        @Override
        public boolean matchesType(String fileName) {
            String file = fileName.toUpperCase();
            return FileChecker.exists(fileName) && file.endsWith(".CSV");
        }

        @Override
        public String contentType() {
            return "text/csv";
        }

        @Override
        public Content content(String fileName) {
            return new CsvContent(fileName);
        }
    }, CSS {
        @Override
        public boolean matchesType(String fileName) {
            String file = fileName.toUpperCase();
            return FileChecker.exists(fileName) && file.endsWith(".CSS");
        }

        @Override
        public String contentType() {
            return "text/css";
        }

        @Override
        public Content content(String fileName) {
            return new CssContent(fileName);
        }
    }, PNG {
        @Override
        public boolean matchesType(String fileName) {
            String file = fileName.toUpperCase();
            return FileChecker.exists(fileName) && file.endsWith(".PNG");
        }

        @Override
        public String contentType() {
            return "image/png";
        }

        @Override
        public Content content(String fileName) {
            return new PngContent(fileName);
        }
    }, JPEG {
        @Override
        public boolean matchesType(String fileName) {
            String file = fileName.toUpperCase();
            return FileChecker.exists(fileName) && (file.endsWith(".JPG") || file.endsWith(".JPEG"));
        }

        @Override
        public String contentType() {
            return "image/jpeg";
        }

        @Override
        public Content content(String fileName) {
            return new JpegContent(fileName);
        }
    }, GIF {
        @Override
        public boolean matchesType(String fileName) {
            String file = fileName.toUpperCase();
            return FileChecker.exists(fileName) && file.endsWith(".GIF");
        }

        @Override
        public String contentType() {
            return "image/gif";
        }

        @Override
        public Content content(String fileName) {
            return new GifContent(fileName);
        }
    }, NULL {
        @Override
        public boolean matchesType(String fileName) {
            return false;
        }

        @Override
        public String contentType() {
            return "";
        }

        @Override
        public Content content(String fileName) {
            return new NullContent();
        }
    };

    abstract public boolean matchesType(String fileName);

    abstract public String contentType();

    abstract public Content content(String fileName);

    public static Type retrieve(String fileName) {
        for (Type type : Type.values()) {
            if (type.matchesType(fileName)) {
                return type;
            }
        }
        return Type.NULL;
    }

    public static Content getContent(String fileName) {
        Type type = retrieve(fileName);
        return type.content(fileName);
    }
}
