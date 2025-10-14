package org.pm.patientservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.pm.patientservice.dto.validators.CreatePatientValidationGroup;

public class PatientRequestDTO {

    @NotBlank(message = "name is required")
    @Size(min = 1, max = 100)
    private String name;

    @NotBlank(message = "email is required")
    @Email
    private String email;

    @NotBlank(message = "address is required")
    private String address;

    @NotBlank(message = "dateOfBirth is required")
    private String dateOfBirth;

    @NotBlank(groups = CreatePatientValidationGroup.class ,message = "registeredDate is required")
    private String registeredDate;

    public @NotBlank(message = "name is required") @Size(min = 1, max = 100) String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "name is required") @Size(min = 1, max = 100) String name) {
        this.name = name;
    }

    public @NotBlank(message = "email is required") @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "email is required") @Email String email) {
        this.email = email;
    }

    public @NotBlank(message = "address is required") String getAddress() {
        return address;
    }

    public void setAddress(@NotBlank(message = "address is required") String address) {
        this.address = address;
    }

    public @NotBlank(message = "dateOfBirth is required") String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(@NotBlank(message = "dateOfBirth is required") String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate( String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
