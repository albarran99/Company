package org.iesfm.programers;

import java.util.Objects;

public abstract class Employee {
    private int id;
    private String name;
    private String surname;
    private int workTime;

    public Employee(int id, String name, String surname, int workTime) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.workTime = workTime;
    }

    protected void basicInfo() {
        System.out.println("Hola me llamo " + name);
        System.out.println(" con apellido " + surname);
        System.out.println(" con el id " + id);
        System.out.println(" y eh trabajado " + workTime + " horas");
        ExpecificInfo();
        System.out.println("--------------------------------");
    }

    public abstract void ExpecificInfo();

    public void logWork(int workTime) {
        this.workTime = this.workTime + workTime;
        System.out.println("Eh trabajado " + workTime);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee member = (Employee) o;
        return id == member.id && workTime == member.workTime && Objects.equals(name, member.name) && Objects.equals(surname, member.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, workTime);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", workTime=" + workTime +
                '}';
    }
}
