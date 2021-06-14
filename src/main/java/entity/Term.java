package entity;

import java.util.ArrayList;

public class Term {
    private int id;
    private String name;
    private String duration;
    private int status = 1;
    private ArrayList<Discipline> disciplines = new ArrayList<>();

    public Term() {
    }

    public Term(int id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }
    public void addDiscipline(Discipline discipline){
        disciplines.add(discipline);
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Term term = (Term) o;

        if (id != term.id) return false;
        if (status != term.status) return false;
        if (name != null ? !name.equals(term.name) : term.name != null) return false;
        if (duration != null ? !duration.equals(term.duration) : term.duration != null) return false;
        return disciplines != null ? disciplines.equals(term.disciplines) : term.disciplines == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (duration != null ? duration.hashCode() : 0);
        result = 31 * result + status;
        result = 31 * result + (disciplines != null ? disciplines.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Term{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", status=" + status +
                ", disciplines=" + disciplines +
                '}';
    }
}
