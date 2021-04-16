package Default;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class User {
    private String name;
    private String password;
    private List<UserRole> roles;
    private String email;
    private Date dateOfBirth;
    
    public User() {
		super();
	}

	public User(String name, String password, List<UserRole> roles, String email, Date dateOfBirth) {
        this.name = name;
        this.password = password;
        this.roles = roles;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public double getAge() {
    	Date now = new Date();
    	long diffInMillies = Math.abs(now.getTime() - this.getDateOfBirth().getTime());
    	long days = TimeUnit.MILLISECONDS.toDays(diffInMillies);
    	return (days / 365);
    }

}
