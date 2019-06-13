package MyProject.Imagica;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionTest{
	@Test
	public void testAddition()
	{
			
	Addition ad =new Addition();
	int result = ad.add(10, 20);
	assertEquals(30,result);
}
}
