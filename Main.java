package dz;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Worker> al = Arrays.asList(
                new Worker("Max","Petrov","male",55,"Kitchen"),
                new Worker("Den","Petgeg","male",36,"IT"),
                new Worker("Maria","Kozlova","female",25,"Kitchen"),
                new Worker("Olga","Neisotova","female",52,"IT"),
                new Worker("Zena","Kislova","female",39,"IT")
        );
        al.stream().filter(s->s.getGender()=="female").filter(s->s.getPlace()=="IT").forEach(s-> System.out.println(s));
    }
}
class Worker{
    private String name;
    private String surname;
    private String gender;
    private int age;
    private String place;

    public Worker(String name, String surname, String gender, int age, String place) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", place='" + place + '\'' +
                '}';
    }
}
