public class House {

    private int window;
    private int doors;
    private int bathroom;
    private boolean townHouse;
    private String location;
    private double rentPrice;
    private double sellPrice;
    private  boolean garage;
    private String color;

    //default
    public House() {
        this(2, 0, 0, false, "unknown",0.0d,0.0d,false, "unknown");


    }

    public House(int window, int doors, int bathroom, boolean townHouse, String location, double rentPrice, double sellPrice, boolean garage, String color) {
        this.window = window;
        this.doors = doors;
        this.bathroom = bathroom;
        this.townHouse = townHouse;
        this.location = location;
        this.rentPrice = rentPrice;
        this.sellPrice = sellPrice;
        this.garage = garage;
        this.color = color;
    }

    public House(int window, int doors, int bathroom,  double rentPrice) {

        this.window = window;
        this.doors = doors;
        this.bathroom = bathroom;
        this.townHouse = townHouse;
        this.location = location;
        this.rentPrice = rentPrice;
        this.sellPrice = sellPrice;
        this.garage = garage;
        this.color = color;
    }


    //getters and setters
    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public boolean isTownHouse() {
        return townHouse;
    }

    public void setTownHouse(boolean townHouse) {
        this.townHouse = townHouse;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "House{" +
                "window = " + window +
                ", doors = " + doors +
                ", bathroom = " + bathroom +
                ", townHouse = " + townHouse +
                ", location = '" + location + '\'' +
                ", rentPrice = " + rentPrice +
                ", sellPrice = " + sellPrice +
                ", garage = " + garage +
                ", color = '" + color + '\'' +
                '}';
    }
}
