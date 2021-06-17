import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;


class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days should it run? ");
        int days = scan.nextInt();
        scan.close();
        
        Garage g = new Garage();
        ArrayList<Vehicle> vehicleList = g.vehicleList;
        
        Mechanic mech = new Mechanic();

        // Creating a File object that represents the disk file.
        PrintStream o = new PrintStream(new File("garage_actions.out"));
        // Store current System.out before assigning a new value
        PrintStream console = System.out;
        // Assign o to output stream
        System.setOut(o);
        
        for(int i=1; i<=days; i++){
            mech.clockIn(i);
            //for loop that runs through garage array and does work on each vehicle
            for(int j=0;j<vehicleList.size();j++){
                mech.unlock(vehicleList.get(j));
                mech.wash(vehicleList.get(j));
                mech.tuneUp(vehicleList.get(j));
                if(mech.testDrive(vehicleList.get(j))){
                    mech = new Mechanic();
                }
                mech.lockUp(vehicleList.get(j));
            }
            mech.clockOut(i);
        }
        // Use stored value for output stream
        System.setOut(console);
        //Lines 18-23,40 from https://www.geeksforgeeks.org/redirecting-system-out-println-output-to-a-file-in-java/
        
    }
}
