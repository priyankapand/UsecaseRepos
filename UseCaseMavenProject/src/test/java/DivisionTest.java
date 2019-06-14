import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.*;


public class DivisionTest{
	@Test
	public void testDiv()
	{
			
	Division ad =new Division();
	int result = ad.div(10, 2);
	assertEquals(5,result);
}
}

