package nutritious.prog.system.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*@Entity
@Table(name = "Client")*/
@NoArgsConstructor
@Getter
@ToString
public class Order {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    //TODO connect objects to certain records in db

    private Item item;
    private Client client;
    private double shippingPrice;
    boolean isSent;

    public Order(Item item, Client client) {
        this.item = item;
        this.client = client;
        this.isSent = false;
        this.shippingPrice = 14.99;
    }

    public double getActualOrderPrice(){
        return item.getPrice() - item.getPrice() * client.getDiscount() + getShippingPrice();
    }
}
