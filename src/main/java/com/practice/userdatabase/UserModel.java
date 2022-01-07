package com.practice.userdatabase;
import javax.persistence.*;


@Entity
@Table(name = "users")
public class UserModel {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String username;
    private String email;
    private String phoneNumber;
    public UserModel() {
        super();
      }

    public UserModel(Long id,String name,String username,String email,String phoneNumer ){
        super();
        this.id=id;
        this.name=name;
        this.username = username;
        this.email=email;
        this.phoneNumber = phoneNumer;       
    }




public Long getId() {
    return id;
}
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
