import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void eventualSafeNodesTest1() {
        int[][] graph = {
                {1, 2},
                {2, 3},
                {5},
                {0},
                {5},
                {},
                {}
        };
        List<Integer> expected = new ArrayList<>(List.of(2, 4, 5, 6));
        List<Integer> actual = new Solution().eventualSafeNodes(graph);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void eventualSafeNodesTest2() {
        int[][] graph = {
                {1, 2, 3, 4},
                {1, 2},
                {3, 4},
                {0, 4},
                {}
        };
        List<Integer> expected = new ArrayList<>(List.of(4));
        List<Integer> actual = new Solution().eventualSafeNodes(graph);

        Assertions.assertEquals(expected, actual);

    }
}
