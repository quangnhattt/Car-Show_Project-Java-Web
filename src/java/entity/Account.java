/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Quang Nhat
 */
public class Account {
    
    private int id;
    private String account;
    private String password;
    private String email;
    private String telephone;
    private String dob;
    private String name;

    public Account() {
    }

    public Account(String account, String password, String email, String telephone, String dob, String name) {
        this.account = account;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.dob = dob;
        this.name = name;
    }

    public Account(String account, String password, String email, String name) {
        this.account = account;
        this.password = password;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", account=" + account + ", password=" + password + ", email=" + email + ", telephone=" + telephone + ", dob=" + dob + ", name=" + name + '}';
    }
    
    
}
