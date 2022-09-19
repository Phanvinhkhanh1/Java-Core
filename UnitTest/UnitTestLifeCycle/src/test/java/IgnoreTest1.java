import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTest1 {
    @Test
    @Ignore("This test case will be ignored")
    public void testEquals() {
        String expected = "Phan Vinh Khanh";
        Assert.assertEquals(expected, "Phan Vinh Khanh");
    }

    @Test
    public void testTrue() {
        Assert.assertTrue(true);
    }

    @Test
    public void testFalse() {
        Assert.assertFalse(false);
    }
}
