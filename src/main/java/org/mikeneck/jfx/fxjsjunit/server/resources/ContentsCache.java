package org.mikeneck.jfx.fxjsjunit.server.resources;

import org.mikeneck.jfx.fxjsjunit.server.resources.contents.NullContent;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: mike
 * @since: 12/03/13
 */
public class ContentsCache {

    private static ContentsCache contentsCache;

    public static final String ROOT_TARGET = "/";

    public static final String ROOT_FILE = "index.html";

    private static Map<String, Content> cache;

    private ContentsCache(ContentsResolver resolver) throws IllegalStateException {
        cache = new HashMap<>();
        String filePath = structHomePath(resolver);
        Content content = Type.getContent(filePath);
        if (content instanceof NullContent) {
            throw new IllegalStateException("Failed to Initialize ContentsCache. The root file cannot be found.");
        }
        cache.put(ROOT_TARGET, content);
    }

    private String structHomePath(ContentsResolver resolver) {
        HomePath homePath = resolver.getHomePath();
        String path = homePath.getPath();
        StringBuilder builder = new StringBuilder(path);
        return builder.append(File.separator)
                .append(ROOT_FILE)
                .toString();
    }

    public static Content getContent(ContentsResolver resolver, String target) throws IllegalStateException {
        if (contentsCache == null) {
            contentsCache = new ContentsCache(resolver);
        }
        Content content;
        synchronized (cache) {
            if (cache.containsKey(target) == true) {
                content = cache.get(target);
            }
            String path = resolver.getPath(target);
            content = Type.getContent(path);
            content.cache(target, cache);
        }
        return content;
    }
}
