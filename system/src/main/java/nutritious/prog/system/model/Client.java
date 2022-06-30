package nutritious.prog.system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Client")
@NoArgsConstructor
@Getter
@ToString
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "name", nullable = false)
    private String name;
    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "ID")
    private Address address;
    @Column(name = "discount", nullable = false)
    private double discount;

    public Client(String name, Address address) {
        this.name = name;
        this.address = address;
        this.discount = 0.0;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
