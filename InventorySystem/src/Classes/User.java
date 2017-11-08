/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Name of the User
 */
public class User {
    
    private String username;
    private String password;
    
    public User() {
        this.username = "";
        this.password = "";
    }
    
    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
