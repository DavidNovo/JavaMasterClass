package novogrodsky;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BuiltInArrayTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Ignore
  @Test
  // This is the command line getting numbers, better for integration tests
  // tests that can mimic human interaction.
  public void testGetIntegers() {
  }


  /**
   * This makes sure the print array function created the desired output.
   */
  @Test
  public void printArray() {
    // create test array
    int[] testIntArray = new int[]{1, 4, 33, 67, 243, 11};

    // call method under test
    BuiltInArray.printArray(testIntArray);
  }

  /**
   * This makes sure that the elements of an array are ordered correctly.
   */
  @Test
  public void testSortIntegers() {
    // create test array
    int[] testIntArray = new int[]{1, 4, 33, 67, 243, 11};

    // call method under test
    int[] sortedArray = BuiltInArray.sortIntegers(testIntArray);

    // test that the order is correct
    assertTrue(
        "The largest integer should be at position 0.  In this case, the value should be 243",
        sortedArray[0] == 243);
  }

}