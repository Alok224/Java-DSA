package bank;
class Account{
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank{
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "Upgrowing";
        account1.email = "email@123.com";
        // account1.password = "abc";

        // to set the password
        account1.setPassword("abc");
        // To print the password
        System.out.println(account1.getPassword());
    }
}