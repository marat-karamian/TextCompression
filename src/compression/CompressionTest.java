package compression;

import org.junit.Test;
import static org.junit.Assert.*;

public class CompressionTest {
    Compression c = new Compression();

    @Test
    public void test() {
        assertEquals("He2l5ow", c.Comp("Hellooooow"));
    }

}
