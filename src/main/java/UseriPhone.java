public class UseriPhone {

    private String manufacturer;
    private String size;
    private String color;
    private String model;
    private boolean faceID;

    public UseriPhone(){

    }

    public UseriPhone(String manufacturer, String size, String color, String model, boolean faceID){
        this.manufacturer = manufacturer;
        this.size = size;
        this.color = color;
        this.model = model;
        this.faceID = faceID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFaceID() {
        return faceID;
    }

    public void setFaceID(boolean faceID) {
        this.faceID = faceID;
    }
}
