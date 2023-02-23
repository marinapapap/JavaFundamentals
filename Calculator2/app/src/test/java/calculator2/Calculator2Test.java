package calculator2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calculator2Test {
  @Test public void testAddsTwoAndTwo() {
    Calculator2 calc = new Calculator2();
    assertEquals("2 + 2 should equal 4", Integer.valueOf(4), calc.add(2, 2));
  }
}