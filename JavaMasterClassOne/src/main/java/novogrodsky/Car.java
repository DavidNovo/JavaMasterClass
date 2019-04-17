package novogrodsky;

/**
 * Test Class.
 */
public class Car {
  // class members

  private String model;

  @Override
  public String toString() {
    System.out.println("A test override");
    return super.toString();
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }
}
