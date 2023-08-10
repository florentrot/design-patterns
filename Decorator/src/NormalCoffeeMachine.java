public class NormalCoffeeMachine implements CoffeeMachine{
    @Override
    public void makeSmallCoffee() {
        System.out.println("Normal coffee machine making SMALL coffee");
    }

    @Override
    public void makeLargeCoffee() {
        System.out.println("Normal coffee machine making LARGE coffee");
    }
}
