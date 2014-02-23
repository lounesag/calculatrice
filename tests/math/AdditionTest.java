package math;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
 
public class AdditionTest {
   protected Addition op;
 
   @Before
   public void setUp() {
      op = new Addition();
   }
 
   @After
   public void tearDown() {
//	   System.out.println("le test est terminer consulter les resultats !!");
   }
 
   @Test
   public void testCalculer() throws Exception {
      assertEquals(new Long(4),
                   op.calculer(new Long(1), new Long(3)));
   }
 
   @Test
   public void testLireSymbole() throws Exception {
      assertNotEquals((Character)'+', op.lireSymbole());
   }
   
   @Test
   public void testLireSymbole2() throws Exception {
      assertEquals((Character)'-', op.lireSymbole());
   }
   
   @Test
   public void testSoustraire() throws Exception {
      assertEquals(new Long (3), op.soustraire(new Long(1),new Long(4)));
   }
   
   
}

