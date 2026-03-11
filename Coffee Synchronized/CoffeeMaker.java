class CoffeeMaker implements Runnable {
    private String menu;
    private CoffeeMachine machine;
    private Counter sy;

    public CoffeeMaker(String menu, CoffeeMachine machine, Counter sy) {
        this.menu = menu;
        this.machine = machine;
        this.sy = sy;
    }

    @Override
    public void run() {
        machine.brew(menu);
        sy.increment();
    }
}