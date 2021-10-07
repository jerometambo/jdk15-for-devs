package org.jerometambo.jdk15;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextBlocks {
    
    public static void main(String... args)
            throws IOException {
        final String html = "<HTML>\n" +
                "  <BODY>\n" +
                "    <H1>Leasa</H1>\n" +
                "  </BODY>\n" +
                "</HTML>\n";
        
        final String newHtml = """
                <html>
                    <body>
                        <h1>Leasa</h1>
                    </body>
                </html>
                """;
        
        Files.writeString(Path.of("/tmp", "old.html"), html, StandardCharsets.UTF_8, CREATE, WRITE);
        Files.writeString(Path.of("/tmp", "new.html"), newHtml, StandardCharsets.UTF_8, CREATE, WRITE);
    
    
        final String newHtmlIndent = """
                <html>
                    <body>
                        <h1>Leasa</h1>
                    </body>
                </html>
    """;
        final String newHtmlIndentSansLigneALafin = """
                <html>
                    <body>
                        <h1>Leasa</h1>
                    </body>
                </html>\
    """;
    
    
        final String newHtmlIndentPlusLoin = """
                <html>
                    <body>
                        <h1>Leasa</h1>
                    </body>
                                        </html>
                                         """;
        final String newHtmlIndentTout = """
                <html>
                    <body>
                        <h1>Leasa</h1>
                    </body>
                </html>
                """.indent(16);
    
        Files.writeString(Path.of("/tmp", "newHtmlIndent.html"), newHtmlIndent, StandardCharsets.UTF_8, CREATE, WRITE);
        Files.writeString(Path.of("/tmp", "newHtmlIndentSansLigneALafin.html"), newHtmlIndentSansLigneALafin, StandardCharsets.UTF_8, CREATE, WRITE);
        Files.writeString(Path.of("/tmp", "newHtmlIndentPlusLoin.html"), newHtmlIndentPlusLoin, StandardCharsets.UTF_8, CREATE, WRITE);
        Files.writeString(Path.of("/tmp", "newHtmlIndentTout.html"), newHtmlIndentTout, StandardCharsets.UTF_8, CREATE, WRITE);
        
    }
    
}
