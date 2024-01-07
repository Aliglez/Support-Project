package dev.ali.SupportProjectBack.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;
    
    private String user_name;
    private String user_mail;
    private String user_phone;

    public Users() {
    }

    public Users(Long id, String user_name, String user_mail, String user_phone) {
        this.id = id;
        this.user_name = user_name;
        this.user_mail = user_mail;
        this.user_phone = user_phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_mail() {
        return user_mail;
    }

    public void setUser_mail(String user_mail) {
        this.user_mail = user_mail;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    
    
    
}
