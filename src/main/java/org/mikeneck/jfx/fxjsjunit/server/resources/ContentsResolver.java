package org.mikeneck.jfx.fxjsjunit.server.resources;

/**
 * @author: mike
 * @since: 12/03/11
 */
public class ContentsResolver {

    private HomePath homePath;

    public ContentsResolver(HomePath homePath) {
        this.homePath = homePath;
    }

    public HomePath getHomePath() {
        return homePath;
    }

    public String getPath(String target) {
        return homePath.getPath(target);
    }

    public Content getContent(String path) {
        return null;
    }
}
