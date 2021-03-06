package org.academiadecodigo.rememberthename.command;

import javax.persistence.Id;
import javax.validation.constraints.*;

public class CustomerDto {


    private Integer id;

    @NotNull(message = "First name is a mandatory camp.")
    @NotBlank(message = "First name is a mandatory camp.")
    @Size(min = 3)
    private String firstName;

    @NotNull(message = "Last name is a mandatory camp.")
    @NotBlank(message = "Last name is a mandatory camp.")
    @Size(min = 3)
    private String lastName;

    @Email
    @NotBlank(message = "Email is a mandatory camp.")
    private String email;

    @Pattern(regexp = "^\\+?[0-9]*$", message = "phone number contains invalid characters")
    @Size(min = 9, max = 16)
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
