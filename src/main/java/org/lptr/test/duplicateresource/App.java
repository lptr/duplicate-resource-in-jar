package org.lptr.test.duplicateresource;

import com.google.common.io.Resources;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Looking for resources...");
        Collections.list(Thread.currentThread().getContextClassLoader().getResources("resource.txt"))
                .forEach(url -> {
                    try {
                        System.out.println(url + ": " + Resources.asCharSource(url, StandardCharsets.UTF_8).read());
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                });
    }
}
