import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Autori {
    private static InputStream inputStream;
    private static OutputStream outputStream;

    Autori(final InputStream inputStream, final OutputStream outputStream) {
        Autori.inputStream = inputStream;
        Autori.outputStream = outputStream;
    }

    public static void main(String[] args) throws IOException {
        validateStreams();

        Scanner scanner = new Scanner(Autori.inputStream);
        PrintStream printStream = new PrintStream(outputStream);

        String input;

        input = scanner.next();

        String yummyString = processInput(input);

        printStream.println(yummyString);
    }

    private static String processInput(String userInput) {

        return Arrays.stream(userInput.split("-")).map((e) -> e.charAt(0)).collect(
                        StringBuilder::new, (sb, i) -> sb.append((char) i), StringBuilder::append).toString();
    }

    private static void validateStreams() {
        if (inputStream == null) {
            inputStream = System.in;
        }

        if (outputStream == null) {
            outputStream = System.out;
        }
    }
}