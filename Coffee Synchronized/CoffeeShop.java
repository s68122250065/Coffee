public class CoffeeShop {
    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();
        Counter sy = new Counter();

        new Thread(new CoffeeMaker("Espresso", machine, sy)).start();
        new Thread(new CoffeeMaker("Latte", machine, sy)).start();
        new Thread(new CoffeeMaker("Mocha", machine, sy)).start();
        new Thread(new CoffeeMaker("Akha Ama Coffee", machine, sy)).start();
        new Thread(new CoffeeMaker("Siam Roastery", machine, sy)).start();
        new Thread(new CoffeeMaker("Tanmonkey Coffee", machine, sy)).start();
        new Thread(new CoffeeMaker("Nescafe Blend & Brew Rich Aroma", machine, sy)).start();
        new Thread(new CoffeeMaker("Moccona Select", machine, sy)).start();
        new Thread(new CoffeeMaker("UCC/Maxim", machine, sy)).start();
        new Thread(new CoffeeMaker("Doi Chaang Coffee", machine, sy)).start();
        System.out.println("End Main");
    }
}