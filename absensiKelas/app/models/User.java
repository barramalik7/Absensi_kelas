package models;

import java.util.*;
import javax.persistence.*;
import play.data.validation.*;
import play.db.jpa.*;

@Entity
public class User extends Model {

    public String username;
    @Email
    public String email;
    public String password;

    public String getUsername() {
        return this.username;
    }

    /**
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    /**
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    /**
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
