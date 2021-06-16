import java.util.Random;

public class Vehicle {
    protected String license;
    public String getLicense() {
        return license;
    }
    public void unlocked() {
        System.out.println(this + " unlocked");
    }
    public void runs() {
        System.out.println(this + " runs");
    }
    //Special case for wash command
    public void shines() {
        Random r = new Random();
        if (r.nextDouble() < 0.3) {
            this.sparkles();
        }
        else {
            System.out.println(this + " shines");
        }
    }
    public void sparkles() {
        System.out.println(this + " sparkles");
    }
    public boolean drives() {
        System.out.println(this + " driven");
        return true;
    }
    public void locked() {
        System.out.println(this + " locked");
    }
    public String toString() {
        return "Vehicle " + license;
    }
}
