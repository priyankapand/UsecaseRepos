package MyProject.Imagica;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
  calculator cal=new calculator();
  
   public CalculatorTest(String name) {
   super(name);
   }
 
   public void testSum() {
   assertEquals(2,cal.sum(1,1));
  }
}