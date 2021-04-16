package Default;

import java.util.Date;
import java.util.List;
import java.time.LocalDate;
public class User {
    private String name;
    private String password;
    private List<UserRole> roles;
    private String email;
    private LocalDate dateOfBirth;

    public User(String name, String password, List<UserRole> roles, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.password = password;
        this.roles = roles;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public User(String name) {
        this.name = name;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
