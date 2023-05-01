package day_5;

public class Motorbike {
    private int yearMoto;
    private String colorMoto;
    private String modelMoto;

    public int getYearMoto() {
        return yearMoto;
    }

    public String getColorMoto() {
        return colorMoto;
    }

    public String getModelMoto() {
        return modelMoto;
    }

    public Motorbike(int yearMoto, String colorMoto, String modelMoto) {
        this.yearMoto = yearMoto;
        this.colorMoto = colorMoto;
        this.modelMoto = modelMoto;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "yearMoto='" + yearMoto + '\'' +
                ", colorMoto='" + colorMoto + '\'' +
                ", modelMoto='" + modelMoto + '\'' +
                '}';
    }
    public void info(){
        System.out.println("This is a motorbike ");
    }
    public int getDifferenceYear(int year){
        return Math.abs(this.yearMoto - year);
    }
}
