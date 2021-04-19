package org.iesfm.programers;

import java.util.HashSet;
import java.util.Objects;

public final class ScrumMaster extends Employee {
    private HashSet<String> teams;

    public ScrumMaster(int id, String name, String surname, int workTime, HashSet<String> teams) {
        super(id, name, surname, workTime);
        this.teams = teams;
    }

    public void joinTeam(String team) {
        if (team != null) {
            teams.add(team);
        }
    }

    public boolean leaveTeam(String team) {
        boolean exist = false;
        if (teams.contains(team)) {
            exist = true;
            teams.remove(team);
        }

        return exist;
    }

    public HashSet<String> getTeams() {
        return teams;
    }

    public void setTeams(HashSet<String> teams) {
        this.teams = teams;
    }

    @Override
    public void ExpecificInfo() {
        for(String myTeam : teams) {
            System.out.println("mis equipos son " + myTeam);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScrumMaster)) return false;
        if (!super.equals(o)) return false;
        ScrumMaster that = (ScrumMaster) o;
        return Objects.equals(teams, that.teams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teams);
    }
}
