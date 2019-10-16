import javax.swing.*;

public class Car {

    //defalt constructor
    public Car() {
        this("unknown", "unknown","white",10.0d,false);
    }

    //overloaded constructor
    public  Car(String make,String model){
        this(make,model,"yellow",40.0d,true);

    }

    //constructor
    public Car(String make,String model, String color, double fuel , boolean automatic){
        this.make =make.toLowerCase();
        this.model = model.toLowerCase();
        this.color = color;
        this.fuel = fuel;
        this.automatic = automatic;
    }
    //access modifiers
    private String make;
    private String model;
    private String color;
    private boolean automatic;
    private double fuel;

    //getter method
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getFuel() {
        return fuel;
    }

    public boolean getAutomatic() {
        return automatic;
    }


    //setter method

    public void setMake(String make) {
        this.make = make.toLowerCase();
    }

    public void setModel(String model) {
        this.model = model.toLowerCase();

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder(" make : ");
        sb.append(this.getMake());
        sb.append(" Model : ");
        sb.append(this.getModel());
        sb.append(" Color : ");
        sb.append(this.getColor());
        sb.append(" Fuel :" );
        sb.append(this.getFuel());
        sb.append(" Automatic : ");
        sb.append(this.getAutomatic());
        sb.append(" ");
        return sb.toString();
    }
}
