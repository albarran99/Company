package org.iesfm.programers;

import java.util.HashSet;
import java.util.Objects;

public final class ProyectManager extends Employee {
    private String team;
    private HashSet<String> draft;

    public ProyectManager(int id, String name, String surname, int workTime, String team, HashSet<String> draft) {
        super(id, name, surname, workTime);
        this.team = team;
        this.draft = draft;
    }

    public boolean makeProyect(String draft) {
        return this.draft.contains(draft);
    }

    public boolean leaveProyect(String team) {
        boolean exist = false;
        if (draft.contains(team)) {
            exist = true;
            draft.remove(team);
        }

        return exist;
    }

    @Override
    public void ExpecificInfo() {
        System.out.println("mi equipo es " + team);
        for (String proyect : draft) {
            System.out.println("mis proyectos son " + proyect);
        }
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public HashSet<String> getDraft() {
        return draft;
    }

    public void setDraft(HashSet<String> draft) {
        this.draft = draft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProyectManager)) return false;
        if (!super.equals(o)) return false;
        ProyectManager that = (ProyectManager) o;
        return Objects.equals(team, that.team) && Objects.equals(draft, that.draft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, draft);
    }
}
