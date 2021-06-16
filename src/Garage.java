import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Random;

//Garage of vehicles creation
public class Garage {
    ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
    Random r = new Random();
    public Garage() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        ArrayList<String> classes = new ArrayList<String>();
        classes.add("Bike");
        classes.add("Trike");
        classes.add("Sidecar");
        classes.add("Hatchback");
        classes.add("SUV");
        classes.add("Wagon");
        classes.add("Convertible");
        classes.add("Pickup");
        classes.add("Delivery");
        classes.add("Monster");
        classes.add("Expresstrain");
        classes.add("Freighttrain");

        // Creating the vehicle objects of each of sub classes of Vehicle class
        for (int j=0; j<classes.size(); j++) { 
            int rand = r.nextInt(2)+3;
            for (int i=0; i<rand; i++) {
                Vehicle vehicleObj = (Vehicle) Class.forName(classes.get(j)).getConstructor().newInstance();
                vehicleList.add(vehicleObj);
            }
        } 
    }

}
