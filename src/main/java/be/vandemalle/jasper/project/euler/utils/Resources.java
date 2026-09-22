package be.vandemalle.jasper.project.euler.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Utility class for reading problem input files from the classpath.
 *
 * @author Jasper Vandemalle
 */
public final class Resources {
    private Resources() {}

    /**
     * Read a resource that lives next to the given class.
     *
     * @param anchor the class whose package contains the resource
     * @param name the resource name, relative to the anchor's package
     * @return the resource contents as UTF-8 text
     * @throws IllegalArgumentException if the resource does not exist
     * @throws UncheckedIOException if the resource cannot be read
     */
    public static String readString(Class<?> anchor, String name) {
        try (InputStream in = anchor.getResourceAsStream(name)) {
            if (in == null) {
                throw new IllegalArgumentException("Resource not found next to " + anchor.getName() + ": " + name);
            }
            return new String(in.readAllBytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new UncheckedIOException("Failed to read resource " + name, e);
        }
    }

    /**
     * Read a resource that lives next to the given class, split into lines.
     *
     * @param anchor the class whose package contains the resource
     * @param name the resource name, relative to the anchor's package
     * @return the non-empty lines of the resource
     */
    public static List<String> readLines(Class<?> anchor, String name) {
        return readString(anchor, name).lines().filter(line -> !line.isBlank()).toList();
    }
}
