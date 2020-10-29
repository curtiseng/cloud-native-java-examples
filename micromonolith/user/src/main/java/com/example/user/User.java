package com.example.user;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "emp")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotNull
    @Size(max = 40)
    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid2")
    @GeneratedValue(generator = "jpa-uuid")
    @Column(length = 40)
    private String id;

    @NotNull
    @Size(max = 40)
    @Column(name = "first_name", length = 40, nullable = false)
    private String firstName;

    @NotNull
    @Size(max = 40)
    @Column(name = "last_name", length = 40, nullable = false)
    private String lastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Emp{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
