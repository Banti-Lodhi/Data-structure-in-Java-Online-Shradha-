class Account {
  public String name;
  protected String email;
  private String password;

  public String getPassword() {
    return password;
  }

  public void setPassword(String pass) {
    this.password = pass;
    // System.out.println(this.password);
  }
}

public class bank {
  public static void main(String[] args) {
    Account A1 = new Account();
    A1.name = "Preetam Singh";
    A1.email = "pms111@yahoo.in";
    A1.setPassword("abcd");
    System.out.println(A1.getPassword());
  }
}
