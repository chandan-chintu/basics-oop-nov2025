package inhertitanceexample;

public class WaterVehicle extends Vehicle{

    public void travelOnWater(){
        System.out.println("these vehicles travels on Water");
    }

    @Override
    public void stop() {
        System.out.println("Water vehicle stopped");
    }

    @Override
    public void start() {
        System.out.println("Water vehicle started");
    }

    @Override
    public void fuel() {
        System.out.println("Water vehicle fueled");
    }
}
