/**
 * 
 */
package cal;

/**
 * @author Mohpiya
 *
 */
import junit.framework.TestCase;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;
public class Caltest extends TestCase {
//  private calculating cl;
   
//@Before
//   public void setup() {
//	 cl = new calculating();
//   }
//	
   calculating cl= new calculating();
   @Test
   public void testgetAdd() {
      double a = 10;
      double b = 20;
      double expectedresult = 30;
      cl.setAdd(a, b);
      double result=cl.getAdd();
      assertEquals(expectedresult, result, 0.0);

   }
   @Test
   public void testgetMultiply() {
      double a = 10;
      double b = 20;
      double expectedresult = 200;
      cl.setMul(a, b);
      double result=cl.getMul();
      assertEquals(expectedresult, result, 0.0);

   }
   @Test
   public void testgetSub() {
      double a = 20;
      double b = 10;
      double expectedresult = 10;
      cl.setSub(a, b);
      double result=cl.getSub();
      assertEquals(expectedresult, result, 0.0);

   }
   @Test
   public void testgetMod() {
      double a = 10;
      double b = 20;
      double expectedresult = 10;
      cl.setMod(a, b);
      double result=cl.getMod();
      assertEquals(expectedresult, result, 0.0);

   }
   @Test
   public void testgetDiv() {
      double a = 20;
      double b = 10;
      double expectedresult = 2;
      cl.setDiv(a,b);
      double result=cl.getDiv();
      assertEquals(expectedresult, result, 0.0);

   }
   @Test(expected = IllegalArgumentException.class)
   public void testgetDivzero() {
      double a = 20;
      double b = 0;
      cl.setDiv(a,b);
      cl.getDiv();
     
   }
}