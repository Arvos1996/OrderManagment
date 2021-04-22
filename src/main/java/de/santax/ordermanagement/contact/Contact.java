package de.santax.ordermanagement.contact;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "contacts")
public class Contact {

    @SequenceGenerator(
            name= "contact_sequence",
            sequenceName ="contact_sequence",
            allocationSize = 1)
    @GeneratedValue(
            generator = "contact_sequence",
            strategy = GenerationType.SEQUENCE
    )
    @Id
    public Long contactId;
    public String firstName;
    public String lastName;
    public String streetName;
    public String postalCode;
    public String postalName;
    public Long telephoneNumber;
    @Enumerated(EnumType.STRING)
    public ContactType contactType;

}
