package day_5;

public class Car {
    private int yearCar;
    private String colorCar;
    private String modelCar;

    public int getYearCar() {
        return yearCar;
    }

    public void setYearCar(int yearCar) {
        this.yearCar = yearCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "yearCar='" + yearCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                '}';
    }
    public void info(){
        System.out.println("This is a car ");
    }
    public int getDifferenceYear(int year){
        return Math.abs(this.yearCar - year);
    }
}
