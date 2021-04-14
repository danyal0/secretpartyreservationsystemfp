package Default;

import java.util.Date;

public class User {
    private String name;
    private String password;
    private UserRole role;
    private String email;
    private Date dateOfBirth;

    public User(String name, String password, UserRole role, String email, Date dateOfBirth) {
        this.name = name;
        this.password = password;
        this.role = role;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
