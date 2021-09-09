import org.junit.Assert;
import org.junit.Test;

public class LineTest 
{
    Line line = new Line(2, 8, 6, 4);

    @Test
    public void testGetSlop() 
    {
        Assert.assertEquals(-1, line.getSlope(), 0.0001);
    }

    @Test
    public void testGetDistance() {
        Assert.assertEquals(5.6568, line.getDistance(), 0.0001);

    }

    @Test
    public void testParallelToForEqualSlope() {
        Line secondLine = new Line(0, 6, 4, 2);
        Assert.assertTrue(line.parallelTo(secondLine));
    }
}