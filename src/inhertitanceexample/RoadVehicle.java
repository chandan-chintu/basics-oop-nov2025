package inhertitanceexample;

public class RoadVehicle extends Vehicle{

    public void travelOnRoad(){
        System.out.println("these vehicles travels on Road");
    }

    @Override
    public void stop() {
        System.out.println("Road vehicle stopped");
    }

    @Override
    public void start() {
        System.out.println("Road vehicle started");
    }

    @Override
    public void fuel() {
        System.out.println("Road vehicle fueled");
    }
}
