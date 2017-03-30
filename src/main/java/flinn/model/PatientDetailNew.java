package flinn.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Embeddable
public class PatientDetailNew {

    private String firstName;

    private String lastName;

    private String physicianName;

    private String physicianEmail;

    private String sex;

    private LocalDate dateOfBirth;

    private String zipCode;

    private String race;

    private String ethnicity;

    private String marital;

    private String employment;

    private String living;

    private String patientIdentifier;

    private LocalDateTime entryDate;

}
