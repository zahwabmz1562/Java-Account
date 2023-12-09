public class Account {
    private String username;
    private String password;

    public Account(String username, String password) {
        this.username = "zahwa";
        this.password = "123";
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean checkValidity() {
        System.out.println("Password anda :");
        if(username.equals("zahwa") && password.equals("123")){
            System.out.println("Login Berhasil");
            return true;
        }else{
            return false;
        }


    }

}

