import java.util.*;


abstract class GarageEmployee {

    public void unlock(Vehicle v){
        
    }
    public void wash(Vehicle v){
        
    }
    public void tuneUp(Vehicle v){
        
    }
    public boolean testDrive(Vehicle v){
        return false;
    }
    public void lockUp(Vehicle v){
        
    }
}
class Mechanic extends GarageEmployee {
    public String employeeName;
    public Mechanic() {
        String[] names = new String[] {"Eli","Manny","Pablo","Marcus","Terry","Jerry","John"};
        Random rand = new Random(); 
        employeeName = names[rand.nextInt(names.length)];
    }
 
    public void clockIn(int day){
        System.out.println("Mechanic " + employeeName + " arrives at the Garage on Day " + day);
    }
    @Override
    public void unlock(Vehicle v){
        System.out.println("Mechanic " + employeeName + " unlocks " + v.toString());
        v.unlocked();
    }
    @Override
    public void wash(Vehicle v){
        System.out.println("Mechanic " + employeeName + " washes " + v.toString());
        v.shines();
    }
    @Override
    public void tuneUp(Vehicle v){
        System.out.println("Mechanic " + employeeName + " tunes up " + v.toString());
        v.runs();
    }
    @Override
    public boolean testDrive(Vehicle v){
        System.out.println("Mechanic " + employeeName + " test drives " + v.toString());
        if(!v.drives()){
            return true;
        }
        return false;
    }
    @Override
    public void lockUp(Vehicle v){
        System.out.println("Mechanic " + employeeName + " locks up " + v.toString());
        v.locked();
    }
    public void clockOut(int day){
        System.out.println("Mechanic " + employeeName + " leaves the Garage on Day " + day);
    }
}


