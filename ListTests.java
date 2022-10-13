import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

import org.junit.*;

public class ListTests {
    @Test
    public void filterTest() {
        List<String> input = new ArrayList<>();
        input.add("pass");
        input.add("no");
        input.add("sdf");
        input.add("pass2");
        Checker check = new Checker();
        List<String> output = new ArrayList<>();
        output.add("pass");
        output.add("pass2");

        assertEquals(output, ListExamples.filter(input, check));
    }

    @Test
    public void mergeTest() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("b");
        List<String> input2 = new ArrayList<>();
        input2.add("c");
        input2.add("d");
        List<String> output = new ArrayList<>();
        output.add("a");
        output.add("b");
        output.add("c");
        output.add("d");
        assertEquals(output, ListExamples.merge(input1, input2));
    }
}
