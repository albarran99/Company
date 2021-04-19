package org.iesfm.programers;

import java.util.*;

public class Company {
    private String name;
    private LinkedList<Employee> employees;

    public Company(String name, LinkedList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public List<Programer> getProgramers() {
        List<Programer> programers = new LinkedList<>();

        for (Employee employee : employees) {
            if (employee instanceof Programer) {
                programers.add((Programer) employee);
            }
        }
        return programers;
    }

    public List<ProyectManager> getProyectManagers() {
        List<ProyectManager> proyectManagers = new LinkedList<>();

        for (Employee employee : employees) {
            if (employee instanceof ProyectManager) {
                proyectManagers.add((ProyectManager) employee);
            }
        }
        return proyectManagers;
    }

    public List<ScrumMaster> getScrumMaster() {
        List<ScrumMaster> scrumMasters = new LinkedList<>();

        for (Employee employee : employees) {
            if (employee instanceof ScrumMaster) {
                scrumMasters.add((ScrumMaster) employee);
            }
        }
        return scrumMasters;
    }

    public List<String> getProyect() {
        List<ProyectManager> managersProyects = getProyectManagers();

        List<String> proyect = new LinkedList<>();

        for (ProyectManager proyectManager : managersProyects) {
            proyect.addAll(proyectManager.getDraft());
        }

        return proyect;
    }

    public Set<String> getTeams() {
        List<ScrumMaster> scrumTeams = getScrumMaster();

        Set<String> teams = new TreeSet<>();

        for (ScrumMaster scrumMaster : scrumTeams) {
            teams.addAll(scrumMaster.getTeams());
        }

        return teams;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(LinkedList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(employees, company.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employees);
    }
}