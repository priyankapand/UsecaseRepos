package FinalDemo.FinalDemo;


import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AdditionTest{
	@Test
	public void testAddition()
	{
			
	Addition ad =new Addition();
	int result = ad.add(10, 20);
// assert.AssertEquals(30,result);
assertTrue("Error, random is too high", 30 == result);

}
}