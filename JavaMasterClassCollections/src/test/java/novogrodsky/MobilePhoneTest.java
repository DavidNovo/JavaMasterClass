package novogrodsky;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MobilePhoneTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  /**
   * This tests that the instructions are printed to the screen when requested by the user.
   */
  @Test
  public void printInstructions() {
    // create mobile phone
    MobilePhone testPhone = new MobilePhone();

    // call print instructions
    MobilePhone.printInstructions();

    // check that the results contain expected strings
    // This is a visual check, since the method does not return anything
    //assertTrue("TRhe output instructions should contain the word remove", System.out.c;);

  }

  @Test
  public void printContacts() {

  }
}