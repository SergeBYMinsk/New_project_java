package day_5;

public class MainTask {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearCar(2020);
        car1.setColorCar("White");
        car1.setModelCar("Chrysler");

        Car car2 = new Car();
        car2.setYearCar(2022);
        car2.setColorCar("Black");
        car2.setModelCar("Tesla");

        car1.info();
        System.out.println(car1.toString());
        System.out.println("\nColor: " + car1.getColorCar() + "\nYear: " + car1.getYearCar() + "\nModel car: " + car1.getModelCar());
        car2.info();
        System.out.println(car2.toString());
        System.out.println("\nColor: " + car2.getColorCar() + "\nYear: " + car2.getYearCar() + "\nModel car: " + car2.getModelCar());
        System.out.println("difference " + car1.getDifferenceYear(car2.getYearCar()) + " years");

        Motorbike motorbike1 = new Motorbike(2022,"Gray","Kawasaki");
        Motorbike motorbike2 = new Motorbike(2020, "Green", "BMW");

        motorbike1.info();
        System.out.println(motorbike1.toString());
        System.out.println("\nYear: " + motorbike1.getYearMoto() + "\nColor: " + motorbike1.getColorMoto() +
                "\nModel: " + motorbike1.getModelMoto());
        motorbike2.info();
        System.out.println(motorbike2.toString());
        System.out.println("\nYear: " + motorbike2.getYearMoto() + "\nColor: " + motorbike2.getColorMoto() +
                "\nModel: " + motorbike2.getModelMoto());
        System.out.println("difference " + motorbike1.getDifferenceYear(motorbike2.getYearMoto()) + " years");

    }
}
