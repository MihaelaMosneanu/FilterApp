
package FilterBirthdayApp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

class BirthdayFilterAppTest {
    String inputFileName = "../resources/Person.txt";
    int targetMonth = 2;
    String outputFileName = "../resources/PersonsSorted.txt";

    @Test
    void testBirthdayFilterApp() {
        BirthdayFilterApp.implementFilter(inputFileName, targetMonth, outputFileName);
        List<String> lines;
        try {
            lines = Files.lines(Paths.get(outputFileName))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Assertions.assertEquals(lines.size(), 2);
    }
}
