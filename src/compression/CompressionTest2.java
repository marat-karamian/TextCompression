package compression;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class CompressionTest2 {
    private String expected;
    private String value;
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new String[][]{{"He2l5ow", "Hellooooow"}, {"w3o4r4ld", "wooorrrrlllld"}, {"s4fs5dfsd8cfdfsf", "sffffsdddddfsdccccccccfdfsf"}});
    }

    public CompressionTest2(String expected, String value) {
        this.expected = expected;
        this.value = value;
    }

    @Test
    public void testParam() {
        assertEquals(expected, new Compression().Comp(value));
    }
}

