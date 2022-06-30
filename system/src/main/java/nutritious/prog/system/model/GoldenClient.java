package nutritious.prog.system.model;

public class GoldenClient extends Client{
    public GoldenClient(String name, Address address) {
        super(name, address);
        super.setDiscount(0.3);
    }
}
