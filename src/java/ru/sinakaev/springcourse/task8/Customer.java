package ru.sinakaev.springcourse.task8;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName;

    @Min(value = 0, message = "must greater than or equals to zero")
    @Max(value = 10, message = "must be less than or equals to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

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

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}

