package nutritious.prog.system.model;

public class GoldenClient extends Client{
    public GoldenClient(String name, Address address) {
        super(name, address);
        super.discount = 0.3;
    }
}
