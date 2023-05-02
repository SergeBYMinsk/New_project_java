package day_6;

import java.util.Random;

public class Teacher {
    private String fio;
    private String item;


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Teacher(String fio, String item) {
        this.fio = fio;
        this.item = item;
    }

    public void evaluateStudent(Student student) {
        Random random = new Random();
        String grade = "";
        switch (random.nextInt(2, 5)) {
            case 2:
                grade = "Vary Bad";
                break;
            case 3:
                grade = "Bad";
                break;
            case 4:
                grade = "Good";
                break;
            case 5:
                grade = "Very good";
                break;
        }
        System.out.println("Teacher: " + this.getFio() + " evaluate student: " + student.getFio() + " item: "
                + this.item + " grade: " + grade);
    }
}
