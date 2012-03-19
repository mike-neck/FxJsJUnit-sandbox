package org.mikeneck.jfx.fxjsjunit.server.resources;

import org.junit.Test;
import org.mikeneck.jfx.fxjsjunit.server.resources.Content;
import org.mikeneck.jfx.fxjsjunit.server.resources.Type;
import org.mikeneck.jfx.fxjsjunit.server.resources.contents.*;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * @author: mike
 * @since: 12/03/14
 */
public class TypeTest {

    private static final String TEST_HTML = "src/test/resources/test.html";

    private static final String TEST_JS = "src/test/resources/js/test.js";

    private static final String TEST_CSV = "src/test/resources/data/test.csv";

    private static final String TEST_CSS = "src/test/resources/style/test.css";

    private static final String TEST_PNG = "src/test/resources/img/test.png";

    private static final String TEST_JPG = "src/test/resources/img/test.jpg";

    private static final String TEST_JPEG = "src/test/resources/img/test.jpeg";

    private static final String TEST_GIF = "src/test/resources/img/test.gif";

    private static final String TEST_U_GIF = "src/test/resources/img/testU.GIF";

    @Test
    public void testNullType () {
        Type type = Type.retrieve("");
        assertThat(type, is(Type.NULL));
        
        type = Type.retrieve(TEST_HTML);
        assertThat(type, is(not(Type.NULL)));
    }

    @Test
    public void testHtmlType () {
        assertThat(Type.HTML.matchesType(""), is(false));
        assertThat(Type.HTML.matchesType(TEST_HTML), is(true));
    }

    @Test
    public void testHtmlRetrieve () {
        Type type = Type.retrieve(TEST_HTML);
        assertThat(type, is(Type.HTML));

        assertThat(type.contentType(), is("text/html"));
    }

    @Test
    public void testHtmlGetContent () {
        Content content = Type.getContent(TEST_HTML);
        assertThat(content, is(instanceOf(HtmlContent.class)));
    }

    @Test
    public void testJavascriptType () {
        Type javascript = Type.JS;
        assertThat(javascript.matchesType(""), is(false));
        assertThat(javascript.matchesType(TEST_JS), is(true));
        assertThat(javascript.matchesType("src/test.js"), is(false));
    }

    @Test
    public void testJavascriptRetrieve () {
        Type type = Type.retrieve(TEST_JS);
        assertThat(type, is(Type.JS));

        assertThat(type.contentType(), is("text/javascript"));
    }

    @Test
    public void testGetJavascriptGetContent () {
        Content content = Type.getContent(TEST_JS);
        assertThat(content, is(instanceOf(JavascriptContent.class)));
    }

    @Test
    public void testCsvType () {
        Type csv = Type.CSV;
        assertThat(csv.matchesType(""), is(false));
        assertThat(csv.matchesType(TEST_CSV), is(true));
        assertThat(csv.matchesType("src/test.csv"), is(false));
    }

    @Test
    public void testCsvRetrieve() {
        Type type = Type.retrieve(TEST_CSV);
        assertThat(type, is(Type.CSV));

        assertThat(type.contentType(), is("text/csv"));
    }

    @Test
    public void testCsvGetContent () {
        Content content = Type.getContent(TEST_CSV);
        assertThat(content, is(instanceOf(CsvContent.class)));
    }

    @Test
    public void testCssType () {
        Type css = Type.CSS;
        assertThat(css.matchesType(""), is(false));
        assertThat(css.matchesType(TEST_CSS), is(true));
        assertThat(css.matchesType("src/test.css"), is(false));
    }

    @Test
    public void testCssRetrieve () {
        Type type = Type.retrieve(TEST_CSS);
        assertThat(type, is(Type.CSS));

        assertThat(type.contentType(), is("text/css"));
    }

    @Test
    public void testCssGetContent () {
        Content content = Type.getContent(TEST_CSS);
        assertThat(content, is(instanceOf(CssContent.class)));
    }

    @Test
    public void testJpegType () {
        Type jpeg = Type.JPEG;
        assertThat(jpeg.matchesType(""), is(false));
        assertThat(jpeg.matchesType(TEST_JPG), is(true));
        assertThat(jpeg.matchesType(TEST_JPEG), is(true));
        assertThat(jpeg.matchesType("src/test.jpeg"), is(false));
    }

    @Test
    public void testJpegRetrieve () {
        Type type = Type.retrieve(TEST_JPG);
        assertThat(type, is(Type.JPEG));

        assertThat(type.contentType(), is("image/jpeg"));
    }

    @Test
    public void testJpegGetContent () {
        Content content = Type.getContent(TEST_JPEG);
        assertThat(content, is(instanceOf(JpegContent.class)));
    }

    @Test
    public void testGifType () {
        Type gif = Type.GIF;
        assertThat(gif.matchesType(""), is(false));
        assertThat(gif.matchesType(TEST_GIF), is(true));
        assertThat(gif.matchesType(TEST_U_GIF), is(true));
        assertThat(gif.matchesType("src/test.gif"), is(false));
    }

    @Test
    public void testGifRetrieve () {
        Type type = Type.retrieve(TEST_GIF);
        assertThat(type, is(Type.GIF));

        assertThat(type.contentType(), is("image/gif"));
    }

    @Test
    public void testGifContent () {
        Content content = Type.getContent(TEST_GIF);
        assertThat(content, is(instanceOf(GifContent.class)));
    }

    @Test
    public void testPngType () {
        Type png = Type.PNG;
        assertThat(png.matchesType(""), is(false));
        assertThat(png.matchesType(TEST_PNG), is(true));
        assertThat(png.matchesType("src/test.png"), is(false));
    }

    @Test
    public void testPngRetrieve () {
        Type type = Type.retrieve(TEST_PNG);
        assertThat(type, is(Type.PNG));

        assertThat(type.contentType(), is("image/png"));
    }

    @Test
    public void testPngContent () {
        Content content = Type.getContent(TEST_PNG);
        assertThat(content, is(instanceOf(PngContent.class)));
    }

    @Test
    public void testNullContent () {
        Content content = Type.getContent("");
        assertThat(content, is(instanceOf(NullContent.class)));
    }
}
