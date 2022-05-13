package pojo;

/**
 * @author: Xugp
 * @date: 2022/2/26 16:45
 * @description:
 */
public class Form {
    private String username;
    private String password;
    private String radio;

    public Form() {
    }

    public Form(String username, String password, String radio) {
        this.username = username;
        this.password = password;
        this.radio = radio;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Form{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", radio='" + radio + '\'' +
                '}';
    }
}
