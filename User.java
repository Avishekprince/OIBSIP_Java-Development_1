public class User {
    private String username;
    private String password;

    public User() {
        this.username = "user";
        this.password = "pass";
    }

    public boolean login(String uname, String pwd) {
        return username.equals(uname) && password.equals(pwd);
    }
}
