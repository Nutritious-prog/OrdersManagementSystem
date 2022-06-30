package nutritious.prog.system;

import nutritious.prog.system.model.Address;
import nutritious.prog.system.model.Client;
import nutritious.prog.system.model.Item;
import nutritious.prog.system.model.Order;
import nutritious.prog.system.repositories.AddressRepository;
import nutritious.prog.system.repositories.ItemRepository;
import nutritious.prog.system.repositories.OrderRepository;
import nutritious.prog.system.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SystemApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(SystemApplication.class, args);

        AddressRepository addressRepository =
                configurableApplicationContext.getBean(AddressRepository.class);

        UserRepository userRepository =
                configurableApplicationContext.getBean(UserRepository.class);

        ItemRepository itemRepository =
                configurableApplicationContext.getBean(ItemRepository.class);

        OrderRepository orderRepository =
                configurableApplicationContext.getBean(OrderRepository.class);

        Address address = new Address("Jugoslowianska 13c", "Lodz", "Lodzkie", "92-720", "Polska");
        addressRepository.save(address);

        Address address2 = new Address("Pomorska 452", "Lodz", "Lodzkie", "92-720", "Polska");
        addressRepository.save(address2);

        Client client = new Client("Jan Kowalski", address, 0.1);
        userRepository.save(client);

        Client client2 = new Client("Adam Kowalski", address, 0.2);
        userRepository.save(client2);

        Client client3 = new Client("Piotr Kowalski", address2, 0.3);
        userRepository.save(client3);

        Item apple = new Item("Apple", 3.5);
        Item watermelon = new Item("Watermelon", 10.0);

        itemRepository.save(apple);
        itemRepository.save(watermelon);

        //Order order = new Order(apple, client3, 14.99);
        //Order order2 = new Order(watermelon, client, 14.99);

        //orderRepository.save(order);
        //orderRepository.save(order2);

        System.out.println(userRepository.count());
    }

}
