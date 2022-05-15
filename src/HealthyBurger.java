public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        super.addHamburgerAddition1(healthyExtra1Name,healthyExtra1Price);
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        super.addHamburgerAddition2(healthyExtra2Name,healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger(){
        return super.itemizeHamburger();
    }
}
