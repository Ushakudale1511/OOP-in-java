package bank;
class Account{
    public String name;
    protected String email;
    private  String password;
    public void setPassword (String password){
        // getters and setters in java : to acces the private acess modifier in the another class
        this.password=password;
    }
    public void getPassword(){
        password="12345";
    }
}
class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "BOI";                  // Set account name
        account.email = "kudale@gmail.com";     // Set account email
        account.setPassword("12345");           // Set account password

        account.getPassword();                  // Print the password
    }
}



