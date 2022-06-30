package nutritious.prog.system.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "Order")
@NoArgsConstructor
@Getter
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @OneToOne
    @JoinColumn(name = "item_id", referencedColumnName = "ID")
    private Item item;
    @OneToOne
    @JoinColumn(name = "client_id", referencedColumnName = "ID")
    private Client client;
    @Column(name = "shipping_price", nullable = false)
    private double shippingPrice;

    public Order(Item item, Client client, double shippingPrice) {
        this.item = item;
        this.client = client;
        this.shippingPrice = shippingPrice;
    }

    public double getActualOrderPrice(){
        return item.getPrice() - item.getPrice() * client.getDiscount() + getShippingPrice();
    }
}
