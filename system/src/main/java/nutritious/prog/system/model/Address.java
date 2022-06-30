package nutritious.prog.system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@NoArgsConstructor
@Getter
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "street", nullable = false)
    private String street;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "voivodeship", nullable = false)
    private String voivodeship;
    @Column(name = "postal_code", nullable = false)
    private String postalCode;
    @Column(name = "country", nullable = false)
    private String country;

    public Address(String street, String city, String voivodeship, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.voivodeship = voivodeship;
        this.postalCode = postalCode;
        this.country = country;
    }
}
