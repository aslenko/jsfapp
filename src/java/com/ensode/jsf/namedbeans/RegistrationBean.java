package com.ensode.jsf.namedbeans;

import com.ensode.jsf.models.*;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value="registrationBean")
@RequestScoped
public class RegistrationBean {

    private String salutation;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private Address address;
    private boolean saved = false;
    
    public RegistrationBean() {
        this.setAddress(new Address());
    }  

    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        this.address = address;
    }   
    
    public boolean getSaved() {
        return this.saved;
    }
           
    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String saveChanges() {
        //save changes to the database or somewhere else
        this.saved = true;
        
        return "confirmation";
    }

}
