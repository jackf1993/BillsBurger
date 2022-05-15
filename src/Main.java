public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Wopper","Beef","White",5.78);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Cheese", 0.66);
        hamburger.addHamburgerAddition2("Tomatos", 0.25);
        hamburger.addHamburgerAddition3("Bacon", 0.51);
        hamburger.addHamburgerAddition4("Avocado", 1.25);
        price = hamburger.itemizeHamburger();
        System.out.println("Total price is "+ price);
        System.out.println("");
        System.out.println("");

        DeluxeBurger deluxe = new DeluxeBurger("Wopper","Beef","White",5.78);
        System.out.println(String.format("Total deluxe price is %.2f", deluxe.itemizeHamburger()));
        deluxe.addHamburgerAddition1("Cheese", 0.66);
        deluxe.addHamburgerAddition2("Tomatos", 0.25);
        deluxe.addHamburgerAddition3("Bacon", 0.51);
        deluxe.addHamburgerAddition4("Avocado", 1.25);
        System.out.println("");
        System.out.println("");

        HealthyBurger healthyBurger = new HealthyBurger("Wopper","Beef","White",5.78);
        healthyBurger.addHealthyAddition1("Light Cheese", 0.75);
        healthyBurger.addHealthyAddition2("Extra Avocado", 2.50);
        System.out.println(String.format("Total Healthy Burger is %.2f", healthyBurger.itemizeHamburger()));

    }
}
