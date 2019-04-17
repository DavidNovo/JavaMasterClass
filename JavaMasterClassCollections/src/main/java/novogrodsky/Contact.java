package novogrodsky;

public class Contact {

  private String fullName = null;
  private String phoneNumber = null;

  public Contact(String fullName, String phoneNumber) {
    this.fullName = fullName;
    this.phoneNumber = phoneNumber;
    return;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


}
