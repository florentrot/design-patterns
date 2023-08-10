public class Bicycle extends Vehicle{
    private boolean isCityBike;

    public Bicycle(int wheels, long price, boolean isCityBike) {
        this.wheels = wheels;
        this.price = price;
        this.isCityBike = isCityBike;
    }

    public Bicycle(Bicycle target) {
        super(target);
        if (target != null) {
            isCityBike = target.isCityBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bicycle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if(target instanceof Bicycle) {
            Bicycle b = (Bicycle) target;
            if(isCityBike == b.isCityBike && wheels == b.wheels && price == b.price) {
                System.out.println(this + " and " + b + " are clones");
                return true;
            }
        }
        System.out.println(this + " and " + target + " are not clones");
        return false;
    }
}
