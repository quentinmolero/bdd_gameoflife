import java.util.Arrays;
import java.util.List;

public class _Main {

    public static void main(String[] args) {
        List<List<Boolean>> grid = Arrays.asList(
                Arrays.asList(false, false, false, false, false),
                Arrays.asList(false, false, true, false, false),
                Arrays.asList(false, false, true, false, false),
                Arrays.asList(false, false, true, false, false),
                Arrays.asList(false, false, false, false, false)
        );

        BoardHandler boardHandler = BoardHandler.of(grid);

        for (int period = 0; period < 5; period++) {
            System.out.println("Period #" + period + ":");
            boardHandler.nextPeriod();
        }
    }
}
