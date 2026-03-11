public class CoffeeShop {
    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();
        Counter atmi = new Counter();

        new Thread(new CoffeeMaker("Espresso", machine, atmi)).start();
        new Thread(new CoffeeMaker("Latte", machine, atmi)).start();
        new Thread(new CoffeeMaker("Mocha", machine, atmi)).start();
        new Thread(new CoffeeMaker("Akha Ama Coffee", machine, atmi)).start();
        new Thread(new CoffeeMaker("Siam Roastery", machine, atmi)).start();
        new Thread(new CoffeeMaker("Tanmonkey Coffee", machine, atmi)).start();
        new Thread(new CoffeeMaker("Nescafe Blend & Brew Rich Aroma", machine, atmi)).start();
        new Thread(new CoffeeMaker("Moccona Select", machine, atmi)).start();
        new Thread(new CoffeeMaker("UCC/Maxim", machine, atmi)).start();
        new Thread(new CoffeeMaker("Doi Chaang Coffee", machine, atmi)).start();
        System.out.println("End Main");
    }
}