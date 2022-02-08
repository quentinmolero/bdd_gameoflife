import java.util.Arrays;
import java.util.List;

public class _Main {

    public static void main(String[] args) {
        List<List<Boolean>> blinker = Arrays.asList(
                Arrays.asList(false, false, false, false, false),
                Arrays.asList(false, false, true, false, false),
                Arrays.asList(false, false, true, false, false),
                Arrays.asList(false, false, true, false, false),
                Arrays.asList(false, false, false, false, false)
        );
        List<List<Boolean>> iColumn = Arrays.asList(
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, true, true, true, false, false, false, false),
                Arrays.asList(false, false, false, false, true, false, true, false, false, false, false),
                Arrays.asList(false, false, false, false, true, true, true, false, false, false, false),
                Arrays.asList(false, false, false, false, true, true, true, false, false, false, false),
                Arrays.asList(false, false, false, false, true, true, true, false, false, false, false),
                Arrays.asList(false, false, false, false, true, true, true, false, false, false, false),
                Arrays.asList(false, false, false, false, true, false, true, false, false, false, false),
                Arrays.asList(false, false, false, false, true, true, true, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false),
                Arrays.asList(false, false, false, false, false, false, false, false, false, false, false)
        );

        BoardHandler boardHandler = BoardHandler.of(blinker);

        for (int period = 0; period < 4; period++) {
            System.out.println("Period #" + period + ":");
            boardHandler.nextPeriod();
        }
    }
}
