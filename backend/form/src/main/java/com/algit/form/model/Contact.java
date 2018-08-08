
package com.algit.form.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Required;

@Entity
@Table(name = "contact")
public class Contact extends AuditModel {
    @Id
    @SequenceGenerator(
            name = "contact_generator",
            sequenceName = "contact_sequence",
            initialValue = 1000,
            allocationSize = 100
    )
    @GeneratedValue(generator = "contact_generator")
    private Long id;

    @NotBlank
    @Size(min = 3, max = 100)
    private String firstAndLastName;

    @NotBlank
    private String email;

    @NotBlank
    private String phoneNumber;

    @Column(columnDefinition = "text")
    private String description;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstAndLastName() {
        return this.firstAndLastName;
    }

    public void setFirstAndLastName(String firstAndLastName) {
        this.firstAndLastName = firstAndLastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}