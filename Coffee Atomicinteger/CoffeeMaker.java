class CoffeeMaker implements Runnable {
    private String menu;
    private CoffeeMachine machine;
    private Counter atmi;

    public CoffeeMaker(String menu, CoffeeMachine machine, Counter atmi) {
        this.menu = menu;
        this.machine = machine;
        this.atmi = atmi;
    }

    @Override
    public void run() {
        machine.brew(menu);
        atmi.increment();
    }
}