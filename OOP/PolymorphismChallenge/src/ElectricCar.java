public class ElectricCar extends Car {

    private double avgKmPerCharge;

    private int batterysize = 6;


    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterysize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterysize = batterysize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d kWh battery on, Ready!%n", batterysize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the everage: %.2f %n", avgKmPerCharge);
    }

}
