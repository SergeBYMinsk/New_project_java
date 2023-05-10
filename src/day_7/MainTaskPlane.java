package day_7;


public class MainTaskPlane {
    public static void main(String[] args) {
        Plane plane = new Plane("Air buss", 2020, 35.5, 2589.5);
        Plane plane1 = new Plane("Boeing", 2019, 158.6, 3894.1);

        System.out.println(plane.toString());
        plane.setBodyLong(38.3);
        plane.setYear(2023);
        plane.fillUp(158);
        System.out.println(plane.toString());
        plane.fillUp(1000);
        System.out.println(plane.toString());

        System.out.println(plane1.toString());
        plane1.setBodyLong(55.8);
        plane1.setYear(2020);
        plane1.fillUp(10);
        System.out.println(plane1.toString());
        plane1.fillUp(580);
        System.out.println(plane1.toString());


        Plane.printingWhichLonger(plane, plane1);
    }
}
