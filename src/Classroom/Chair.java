package Classroom;

public class Chair {
    private MyDimenison dimenison;
    private Physical physical;
    private String material;
    private boolean isOccupied;

    public Chair(){
        this.dimenison = new MyDimension();
        this.physical = new Physical();
        this.material = "plastic";
        this.isOccupied = false;
    }
    public Chair(MyDimenison dimenison, Physical physical, String material, boolean isOccupied) {
        this.dimenison = dimenison;
        this.physical = physical;
        this.material = material;
        this.isOccupied = isOccupied;
    }

    public MyDimenison getDimenison() {
        return dimenison;
    }

    public void setDimenison(MyDimenison dimenison) {
        this.dimenison = dimenison;
    }

    public Physical getPhysical() {
        return physical;
    }

    public void setPhysical(Physical physical) {
        this.physical = physical;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
    public void sit(){
        if(!isOccupied){
            System.out.println("you sit");
            isOccupied  = true;
        }else{
            System.out.println("the chair is not empty, you can not sit");
            isOccupied =false;

        }
    }
}
