package nutritious.prog.system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;

/*@Entity
@Table(name = "Client")*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Item {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    //@Column(name = "name", nullable = false)
    String name;
    //@Column(name = "price", nullable = false)
    double price;
}
