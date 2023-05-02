package day_6;

public class Plane {
    private String manufacturer;
    private int year;
    private double bodyLong;
    private double weight;
    private double fuelVolume;

    public void setYear(int year) {
        this.year = year;
    }

    public void setBodyLong(double bodyLong) {
        this.bodyLong = bodyLong;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getBodyLong() {
        return bodyLong;
    }

    public Plane(String manufacturer, int year, double bodyLong, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.bodyLong = bodyLong;
        this.weight = weight;
        this.fuelVolume = 0;
    }

    public void fillUp(int insideFuel) {
        this.fuelVolume += insideFuel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", bodyLong=" + bodyLong +
                ", weight=" + weight +
                ", fuelVolume=" + fuelVolume +
                '}';
    }
    public static void printingWhichLonger(Plane plane, Plane plane1){
        if(plane.getBodyLong() > plane1.getBodyLong()){
            System.out.println(plane.getManufacturer() + " long");
        } else {
            System.out.println(plane.getManufacturer() + " small");
        }
    }
}
