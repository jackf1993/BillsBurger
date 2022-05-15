public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String name, String meat, String breadRollType, double price) {
        super(name, meat, breadRollType, (price+19.10));
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        price = 0;
        System.out.println(String.format("Cannot add %s to Deluxe Order", name));
        super.addHamburgerAddition1(name, price);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        price = 0;
        System.out.println(String.format("Cannot add %s to Deluxe Order", name));
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        price = 0;
        System.out.println(String.format("Cannot add %s to Deluxe Order", name));
        super.addHamburgerAddition3(name, price);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        price = 0;
        System.out.println(String.format("Cannot add %s to Deluxe Order", name));
        super.addHamburgerAddition4(name, price);
    }
}
