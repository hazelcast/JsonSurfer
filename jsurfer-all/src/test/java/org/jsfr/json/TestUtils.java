package org.jsfr.json;

import org.apache.commons.compress.utils.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public final class TestUtils {

    private TestUtils() {
    }

    public static String readClasspathResource(String resourceName, Charset charset) {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(resourceName);
        if (inputStream == null) {
            return null;
        }
        try {
            return new String(IOUtils.toByteArray(inputStream), charset);
        } catch (IOException e) {
            return null;
        }
    }
}
