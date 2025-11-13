package inhertitanceexample;

public final class AirVehicle extends Vehicle{

    public void travelOnAir(){
        super.color="green";
        System.out.println("these vehicles travels on Air");
        System.out.println("color is : "+super.color);
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Air vehicle stopped");
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Air vehicle started");
    }

    @Override
    public void fuel() {
        super.fuel();
        System.out.println("Air vehicle fueled");
    }
}
