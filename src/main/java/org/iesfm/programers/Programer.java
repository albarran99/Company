package org.iesfm.programers;

import java.util.LinkedList;
import java.util.Objects;

public final class Programer extends Employee {
    private LinkedList<String> language;
    private String team;

    public Programer(int id, String name, String surname, int workTime, LinkedList<String> language, String team) {
        super(id, name, surname, workTime);
        this.language = language;
        this.team = team;
    }

    @Override
    public void ExpecificInfo() {
        for (String language : language) {
            System.out.println("los lenguajes que sé son " + language);

        }
    }


    public LinkedList<String> getLanguage() {
        return language;
    }

    public void setLanguage(LinkedList<String> language) {
        this.language = language;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programer)) return false;
        if (!super.equals(o)) return false;
        Programer programer = (Programer) o;
        return Objects.equals(language, programer.language) && Objects.equals(team, programer.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, team);
    }

    @Override
    public String toString() {
        return "Programer{" +
                "language=" + language +
                ", team='" + team + '\'' +
                '}';
    }
}