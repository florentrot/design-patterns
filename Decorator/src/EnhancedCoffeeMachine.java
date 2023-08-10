public class EnhancedCoffeeMachine implements CoffeeMachine{

    private NormalCoffeeMachine normalCoffeeMachine;

    public EnhancedCoffeeMachine(NormalCoffeeMachine normalCoffeeMachine) {
        this.normalCoffeeMachine = normalCoffeeMachine;
    }

    //Override behaviour

    @Override
    public void makeSmallCoffee() {
        System.out.println("Enhanced coffee machine making SMALL coffee");
    }

    //Unaltered behaviour
    @Override
    public void makeLargeCoffee() {
        normalCoffeeMachine.makeLargeCoffee();
    }

    //Extended behaviour
    public void makeMilkCoffee() {
        System.out.println("Enhanced coffee machine making MILK coffee");
        normalCoffeeMachine.makeLargeCoffee();
        System.out.println("Enhanced coffee machine: Adding Milk");
    }
}
