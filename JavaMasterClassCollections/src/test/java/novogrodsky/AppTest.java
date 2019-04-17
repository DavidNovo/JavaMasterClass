package novogrodsky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Ignore;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase {

  /**
   * Create the test case.
   *
   * @param testName name of the test case
   */
  public AppTest(String testName) {
    super(testName);
  }

  /**
   * Default test suite.
   *
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(AppTest.class);
  }

  /**
   * Rigourous Test :-) .
   */
  public void testApp() {
    assertTrue(true);
  }

  @Ignore
  // This test is not needed
  public void testMain() {
  }


}
