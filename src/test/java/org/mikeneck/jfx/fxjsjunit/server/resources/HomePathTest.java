package org.mikeneck.jfx.fxjsjunit.server.resources;

import org.junit.Test;
import org.mikeneck.jfx.fxjsjunit.server.resources.HomePath;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * @author: mike
 * @since: 12/03/12
 */
public class HomePathTest {

    @Test
    public void testConstructor () {
        HomePath path = new HomePath();
        assertThat(path, is(notNullValue()));
        assertThat(path.getPath(), is("src/test/resources"));
    }

    @Test
    public void testPathValidationSafeCase () {
        String pathString = "src/test/resources/js";
        HomePath path = new HomePath(pathString);
        assertThat(path, is(notNullValue()));
        assertThat(path.getPath(), is(pathString));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPathValidationNotExists () {
        String pathString = "src/not/exists";
        HomePath path = new HomePath(pathString);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPathValidationNullCase () {
        new HomePath(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testPathValidationFileCase () {
        String pathString = "build.gradle";
        new HomePath(pathString);
    }
}
