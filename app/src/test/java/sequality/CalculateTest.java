package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void teststartCalculation() {
    Calculate calculate = new Calculate();
    assertNotNull("Start Calculation", calculate.startCalculation());
  }

  @Test
  public void testmul() {
    Calculate calculate = new Calculate();
    int expected = 6;
    assertEquals(expected, calculate.mul(2, 3));
  }

  @Test
  public void testoddeven() {
    Calculate calculate = new Calculate();
    assertNotNull("odd", calculate.oddeven(6));
  }
}
